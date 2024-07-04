package com.toukir.androidmvparchitecture.post;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.View;

import com.toukir.androidmvparchitecture.R;
import com.toukir.androidmvparchitecture.base.BaseFragment;
import com.toukir.androidmvparchitecture.databinding.FragmentPostBinding;

public class PostFragment extends BaseFragment<FragmentPostBinding> {

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
    }
}
