package com.simona.oxforddictionary4;

import android.os.Build;

import com.simona.oxforddictionary4.pojoClasses.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface APIinterface {

    @Headers("Accept: application/json")
    @GET("en-us/{word}?strictMatch=false")
    Call<Example> getDefinitionsExamplesSynonymusFromDictionary(
            @Header("app_id") String apiIDul,
            @Header("app_key") String apiKeyul,
            @Path("word") String chosenWord
    );

}
