package com.toukir.androidmvparchitecture.ui.post;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.View;

import com.toukir.androidmvparchitecture.R;
import com.toukir.androidmvparchitecture.adapter.PostAdapter;
import com.toukir.androidmvparchitecture.base.BaseFragment;
import com.toukir.androidmvparchitecture.data.model.PostResponse;
import com.toukir.androidmvparchitecture.databinding.FragmentPostBinding;

import java.util.List;

public class PostFragment extends BaseFragment<FragmentPostBinding> implements PostContract.View {

    private PostPresenter mPostPresenter;

    public PostFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_post;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mPostPresenter = new PostPresenter(this);
        mPostPresenter.onPostTask();
    }

    @Override
    public void showLoader() {
        showLoading();
    }

    @Override
    public void hideLoader() {
        hideLoading();
    }

    @Override
    public void showMessage(String message) {
        showToast(message);
    }

    @Override
    public Context getContext() {
        return requireActivity();
    }

    @Override
    public void showPostList(@NonNull List<PostResponse> postResponseList, String message, boolean isFound) {
        hideLoader();
        requireActivity().runOnUiThread(() -> {
            PostAdapter postAdapter = new PostAdapter(postResponseList);
            binding.recyclerViewPost.setAdapter(postAdapter);
        });
    }
}
