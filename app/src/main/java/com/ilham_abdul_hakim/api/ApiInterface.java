package com.ilham_abdul_hakim.api;

import com.ilham_abdul_hakim.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("users")
    Call<List<User>> getAllUser();
}
