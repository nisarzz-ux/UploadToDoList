package com.example.todolist.module.create;

import android.view.View;

import com.example.todolist.base.FragmentHolderActivityBase;

public class TodoListCreate extends FragmentHolderActivityBase {
    TodoListCreateFragment todoListCreateFragment;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
        ivIcon.setVisibility(View.VISIBLE);

        todoListCreateFragment = new TodoListCreateFragment();
        setCurrentFragment(todoListCreateFragment, false);
    }
}
