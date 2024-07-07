package com.toukir.androidmvparchitecture.ui.post;

import com.toukir.androidmvparchitecture.data.model.PostResponse;
import com.toukir.androidmvparchitecture.utils.ConnectivityUtils;

import java.util.ArrayList;
import java.util.List;

public class PostPresenter extends PostApiTaskImpl implements PostContract.Presenter {

    private final PostContract.View mPostView;
    private final ConnectivityUtils connectivityUtils;

    public PostPresenter(PostContract.View mPostView) {
        super(mPostView);
        this.mPostView = mPostView;
        this.connectivityUtils = new ConnectivityUtils(mPostView.getContext());
    }

    @Override
    public void onPostTask() {
        if (connectivityUtils.isOnline()) {
            onPostApiTask();
        } else {
            onPostDBTask();
        }
    }

    @Override
    public void onPostDBTask() {
        mPostView.showPostList(new ArrayList<>(), "Data From Local DB", false);
    }

    @Override
    public void onPostAPITaskComplete(List<PostResponse> postResponseList, String message, boolean isFound) {
        mPostView.showPostList(postResponseList, message, isFound);
    }
}
