package com.toukir.androidmvparchitecture.post;

public abstract class PostApiTaskImpl implements PostApiTask {

    private final PostContract.View mPostView;

    public PostApiTaskImpl(PostContract.View mPostView) {
        this.mPostView = mPostView;
    }
}
