package com.toukir.androidmvparchitecture.ui.post;

import android.content.Context;

import com.toukir.androidmvparchitecture.base.BaseView;
import com.toukir.androidmvparchitecture.data.model.PostResponse;

import java.util.List;

public class PostContract {

    interface View extends BaseView {
        Context getContext();

        void showPostList(List<PostResponse> postResponseList, String message, boolean isFound);
    }

    interface Presenter {
        void onPostTask();

        void onPostDBTask();
    }
}
