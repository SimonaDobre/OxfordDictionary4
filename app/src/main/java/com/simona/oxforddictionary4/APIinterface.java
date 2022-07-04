package com.simona.oxforddictionary4;

import android.os.Build;

import com.simona.oxforddictionary4.pojoClasses.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface APIinterface {

//    String APPID = BuildConfig.APP_ID;
//    String APPKEY = BuildConfig.APP_KEY;

    @Headers({"Accept: application/json",
            "app_id: APP_ID_OXFORD",
            "app_key: APP_KEY_OXFORD"})

    @GET("en-us/{word}?strictMatch=false")
    Call<Example> getDefExamplesSynonymsFromDictionary(
            @Path("word") String cuvantAles
    );


    // fields=definitions%2Cexamples&
}
