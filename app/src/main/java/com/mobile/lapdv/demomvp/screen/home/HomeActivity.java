package com.mobile.lapdv.demomvp.screen.home;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mobile.lapdv.demomvp.R;
import com.mobile.lapdv.demomvp.base.BaseActivity;
import com.mobile.lapdv.demomvp.screen.home.model.Student;
import com.mobile.lapdv.demomvp.screen.home.presenter.HomePresenter;
import com.mobile.lapdv.demomvp.screen.home.view.HomeView;
import com.mobile.lapdv.demomvp.screen.home.view.StudentAdapter;
import com.mobile.lapdv.demomvp.widget.SimpleDividerItemDecoration;

import java.util.ArrayList;

public class HomeActivity extends BaseActivity implements HomeView {

    private RecyclerView mRecyclerView;
    private HomePresenter mHomePresenter;

    @Override
    protected void initView() {
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initData() {
        mHomePresenter = new HomePresenter();
        mHomePresenter.setOnView(this);
        mHomePresenter.loadData();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void showData(ArrayList<Student> students) {
        System.out.println("showData" + students.size() + students);
        setUpAdapter(students);
    }

    @Override
    public void showError(String message) {
        System.out.println("Message :" + message);
    }

    private void setUpAdapter(ArrayList<Student> students) {
        if (students != null) {
            StudentAdapter studentAdapter = new StudentAdapter(students);
            mRecyclerView.setAdapter(studentAdapter);
            studentAdapter.notifyDataSetChanged();
            mRecyclerView.addItemDecoration(new SimpleDividerItemDecoration(this));
        }
    }
}
