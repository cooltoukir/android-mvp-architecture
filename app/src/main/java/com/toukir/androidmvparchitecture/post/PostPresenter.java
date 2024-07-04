package com.toukir.androidmvparchitecture.post;

public class PostPresenter extends PostApiTaskImpl implements PostContract.Presenter {

    private final PostContract.View mPostView;

    public PostPresenter(PostContract.View mPostView) {
        super(mPostView);
        this.mPostView = mPostView;
    }
}
