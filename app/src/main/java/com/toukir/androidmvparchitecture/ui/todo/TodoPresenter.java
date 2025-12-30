package com.toukir.androidmvparchitecture.ui.todo;

public class TodoPresenter implements TodoContract.Presenter {

    private TodoContract.View mTodoView;
    private final TodoApiTask todoApiTask;

    public TodoPresenter(TodoContract.View mTodoView) {
//        super(mTodoView);
        this.mTodoView = mTodoView;
        this.todoApiTask = new TodoApiTaskImpl(mTodoView);
    }

    @Override
    public void onTodoTask() {
        mTodoView.showLoader();
        todoApiTask.onTodoApiTask();
    }
}
