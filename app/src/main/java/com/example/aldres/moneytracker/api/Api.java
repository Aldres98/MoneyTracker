package com.example.aldres.moneytracker.api;

import com.example.aldres.moneytracker.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Aldres on 10.11.2017.
 */

public interface Api {

    @GET("items")
    Call<List<Item>> items(@Query("type") String type);

    @GET("items/add")
    Call<List<Item>> add(@Query("name") String name, @Query("price") String price);

}
