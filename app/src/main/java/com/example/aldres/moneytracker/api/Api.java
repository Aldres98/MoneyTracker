package com.example.aldres.moneytracker.api;

import com.example.aldres.moneytracker.AuthResult;
import com.example.aldres.moneytracker.Item;
import com.example.aldres.moneytracker.Result;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Aldres on 10.11.2017.
 */

public interface Api {

    @GET("auth")
    Call<AuthResult> auth(@Query("social_user_id") String socialUserId);

    @GET("items")
    Call<List<Item>> items(@Query("type") String type);

    @POST("items/add")
    Call<AddResult> add(@Query("name") String name, @Query("price") int price, @Query("type") String type);

    @POST("items/remove")
    Call<Result> remove(@Query("id") int id);


}
