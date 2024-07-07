package com.toukir.androidmvparchitecture.api.response;

public class ResponseCallback<T> {
    private T body;

    public ResponseCallback(T body) {
        this.body = body;
    }

    public T getBody(){
        return body;
    }
}
