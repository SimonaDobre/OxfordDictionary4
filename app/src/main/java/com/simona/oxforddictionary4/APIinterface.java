package com.simona.oxforddictionary4;

import com.simona.oxforddictionary4.pojoClasses.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface APIinterface {

    @Headers({"Accept: application/json",
            "app_id: 16a21064",
            "app_key: d51f913a7d4d9f3a3f945e2ce290648d"})

    @GET("en-us/{word}?strictMatch=false")
    Call<Example> getDefExamplesSynonymsFromDictionary(
            @Path("word") String cuvantAles
    );


    // fields=definitions%2Cexamples&
}
