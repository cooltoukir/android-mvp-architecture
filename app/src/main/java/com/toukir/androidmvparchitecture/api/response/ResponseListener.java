package com.toukir.androidmvparchitecture.api.response;

public interface ResponseListener<T> {
    void onResponse(ResponseCallback<T> response, String message);
    void onFailure(String message);
}
