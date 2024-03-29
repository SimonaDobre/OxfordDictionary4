package com.simona.oxforddictionary4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.simona.oxforddictionary4.pojoClasses.Entry;
import com.simona.oxforddictionary4.pojoClasses.Example;
import com.simona.oxforddictionary4.pojoClasses.Example__1;
import com.simona.oxforddictionary4.pojoClasses.LexicalEntry;
import com.simona.oxforddictionary4.pojoClasses.Result;
import com.simona.oxforddictionary4.pojoClasses.Sense;
import com.simona.oxforddictionary4.pojoClasses.Synonym;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    EditText inputED;
    Button searchBtn;
    TextView nameTV, definitionTV, synonymusTV, exampleTV;
    ImageButton spearkerButton;
    TextToSpeech tts;
    String searchedWord = "";
    View.OnClickListener clickBtnListener;
    APIinterface apIinterface;

    private String baseURLstring =
            "https://od-api.oxforddictionaries.com:443/api/v2/entries/";
    private String app_idul = BuildConfig.APP_ID_OXFORD;
    private String app_keyul = BuildConfig.APP_KEY_OXFORD;

    List<String> listDefinitions, listSynonymus, listExamples;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        speak();
    }


    private void initViews() {
        listDefinitions = new ArrayList<>();
        listExamples = new ArrayList<>();
        listSynonymus = new ArrayList<>();
        nameTV = findViewById(R.id.numeID);
        definitionTV = findViewById(R.id.definitionTV);
        synonymusTV = findViewById(R.id.synoTV);
        exampleTV = findViewById(R.id.exampleTV);
        searchBtn = findViewById(R.id.searchButton);
        inputED = findViewById(R.id.inputEditText);
        spearkerButton = findViewById(R.id.speakerButton);
        spearkerButton.setEnabled(false);

        Retrofit myRetrofit = new Retrofit.Builder()
                .baseUrl(baseURLstring)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apIinterface = myRetrofit.create(APIinterface.class);

        clickBtnListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int clickedID = view.getId();
                switch (clickedID) {
                    case R.id.searchButton:
                        searchedWord = inputED.getText().toString().trim().toLowerCase();
                        listDefinitions.clear();
                        listExamples.clear();
                        listSynonymus.clear();

                        SpannableString def = new SpannableString("DEFINITIONS:");
                        def.setSpan(new StyleSpan(Typeface.BOLD), 0, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        definitionTV.setText(def); // + "\n");
                        definitionTV.append("\n");

                        SpannableString syn = new SpannableString("SYNONYMS:");
                        syn.setSpan(new StyleSpan(Typeface.BOLD), 0,9, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE );
                        synonymusTV.setText(syn);
                        synonymusTV.append("\n");

                        SpannableString ex = new SpannableString("EXAMPLES:");
                        ex.setSpan(new StyleSpan(Typeface.BOLD), 0, 9, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
                        exampleTV.setText(ex);
                        exampleTV.append("\n");

                        getDefinitionExamplesSynonyms(searchedWord);
                        inputED.setText(null);
                        hidekeyboard();
                        break;
                    case R.id.speakerButton:
                        tts.setSpeechRate(1.0f);
                        tts.speak(searchedWord, TextToSpeech.QUEUE_FLUSH, null);
                        break;
                }
            }
        };
        spearkerButton.setOnClickListener(clickBtnListener);
        searchBtn.setOnClickListener(clickBtnListener);
    }

    void speak() {
        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    spearkerButton.setEnabled(true);
                }
            }
        });
    }

    void hidekeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(inputED.getWindowToken(), 0);
    }

    private void getDefinitionExamplesSynonyms(String searchedWord) {
        Call<Example> callerExample = apIinterface.getDefinitionsExamplesSynonymusFromDictionary( app_idul, app_keyul, searchedWord);
        callerExample.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (!response.isSuccessful()) {
                    return;
                }
                Example example = response.body();
                List<Result> listResults = example.getResults();
                Result rez = listResults.get(0);
                List<LexicalEntry> listLexicalEntries = rez.getLexicalEntries();
                for (LexicalEntry le : listLexicalEntries) {
                    List<Entry> listEntries = le.getEntries();
                    for (Entry entry : listEntries) {
                        List<Sense> listSenses = entry.getSenses();
                        for (Sense currentSense : listSenses) {

                            // DEFINITII:
                            try {
                                listDefinitions.add(currentSense.getDefinitions().get(0));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                            //EXEMPLE:
                            try {
                                List<Example__1> listEXAMPLES = currentSense.getExamples();
                                for (Example__1 e1 : listEXAMPLES) {
                                    String exCurent = e1.getText();
                                    listExamples.add(exCurent);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                            // SINONIME
                            try {
                                List<Synonym> listSYNO = currentSense.getSynonyms();
                                for (Synonym synonym : listSYNO) {
                                    listSynonymus.add(synonym.getText());
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                for (String s : listDefinitions) {
                    definitionTV.append(s + "\n");
                }
                for (String s : listExamples) {
                    exampleTV.append(s + "\n");
                }
                for (String sino : listSynonymus) {
                    synonymusTV.append(sino + "\n");
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });
        nameTV.setText(searchedWord);
    }


}