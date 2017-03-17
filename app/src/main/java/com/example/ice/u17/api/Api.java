package com.example.ice.u17.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

class Api {
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://app.u17.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static HomeService getHomeService() {
        return retrofit.create(HomeService.class);
    }


}
