package com.toukir.androidmvparchitecture.api.rest;

import com.toukir.androidmvparchitecture.data.model.PostResponse;
import com.toukir.androidmvparchitecture.data.model.TodoResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitAPI {

    @GET("posts")
    Call<List<PostResponse>> getPost();

    @GET("todos")
    Call<List<TodoResponse>> getTodo();
}
