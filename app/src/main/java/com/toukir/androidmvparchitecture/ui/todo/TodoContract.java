package com.toukir.androidmvparchitecture.ui.todo;

import com.toukir.androidmvparchitecture.base.BaseView;
import com.toukir.androidmvparchitecture.data.model.TodoResponse;

import java.util.List;

public class TodoContract {

    interface View extends BaseView {
        void onTodoTaskFinish(List<TodoResponse> todoResponseList);
    }

    interface Presenter {
        void onTodoTask();
    }
}
