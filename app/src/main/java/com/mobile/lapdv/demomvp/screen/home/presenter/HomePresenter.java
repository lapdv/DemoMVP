package com.mobile.lapdv.demomvp.screen.home.presenter;

import com.mobile.lapdv.demomvp.screen.home.model.Student;
import com.mobile.lapdv.demomvp.screen.home.view.HomeView;

import java.util.ArrayList;

/**
 * Created by lap on 26/04/2018.
 */

public class HomePresenter implements IStudentPresenter {

    private HomeView mHomView;

    @Override
    public void setOnView(HomeView view) {
        mHomView = view;
    }

    @Override
    public void onStart() {
        //TODO
    }

    @Override
    public void loadData() {
        if (getDataStudent() != null) {
            mHomView.showData(getDataStudent());
        } else {
            mHomView.showError("Error presenter not handle");
        }
    }

    private ArrayList<Student> getDataStudent() {
        ArrayList<Student> mStudentArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Student student = new Student();
            student.setName("lapdv" + i);
            student.setAddress("namdinh" + i);
            mStudentArrayList.add(student);
        }
        return mStudentArrayList;
    }

}
