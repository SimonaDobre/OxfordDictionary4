package com.simona.oxforddictionary4.pojoClasses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.simona.oxforddictionary4.MainActivity;
import com.simona.oxforddictionary4.R;

public class ActivityB extends AppCompatActivity {

    LinearLayout wholeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        initViews();

    }

    void  initViews(){
        wholeScreen = findViewById(R.id.wholeScreenID);
        wholeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMainActivity = new Intent(ActivityB.this, MainActivity.class);
                startActivity(toMainActivity);
            }
        });
    }

}