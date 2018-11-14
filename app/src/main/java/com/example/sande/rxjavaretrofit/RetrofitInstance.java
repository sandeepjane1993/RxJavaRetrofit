package com.example.sande.rxjavaretrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static Retrofit retrofitJson;

    public static final String BASE_URL = "http://rjtmobile.com";
    public static final String BASE_URL_PHOTOS = "https://jsonplaceholder.typicode.com";

    public static Retrofit getRetrofitJsonInstance()
    {
        if(retrofitJson == null)
        {
            retrofitJson = new Retrofit.Builder()
                    .baseUrl(BASE_URL_PHOTOS)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofitJson;
    }
}
