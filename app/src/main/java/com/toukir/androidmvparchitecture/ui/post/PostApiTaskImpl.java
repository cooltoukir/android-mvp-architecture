package com.toukir.androidmvparchitecture.ui.post;

import com.toukir.androidmvparchitecture.api.repo.PostRepository;
import com.toukir.androidmvparchitecture.api.response.ResponseCallback;
import com.toukir.androidmvparchitecture.api.response.ResponseListener;
import com.toukir.androidmvparchitecture.data.model.PostResponse;

import java.util.ArrayList;
import java.util.List;

public abstract class PostApiTaskImpl implements PostApiTask {

    private final PostContract.View mPostView;

    public PostApiTaskImpl(PostContract.View mPostView) {
        this.mPostView = mPostView;
    }

    @Override
    public void onPostApiTask() {
        mPostView.showLoader();
        PostRepository postRepository = PostRepository.getInstance();
        postRepository.setPostResponse();
        postRepository.setOnPostResponseListener(onPostCallbackListener);
    }

    private final ResponseListener<List<PostResponse>> onPostCallbackListener = new ResponseListener<List<PostResponse>>() {
        @Override
        public void onResponse(ResponseCallback<List<PostResponse>> response, String message) {
            mPostView.hideLoader();
            List<PostResponse> postResponseList = response.getBody();
            onPostAPITaskComplete(postResponseList, "From Api", true);
        }

        @Override
        public void onFailure(String message) {
            mPostView.hideLoader();
            onPostAPITaskComplete(new ArrayList<>(), "From Api", false);
        }
    };

    public abstract void onPostAPITaskComplete(List<PostResponse> postResponseList, String message, boolean isFound);
}
