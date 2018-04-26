package com.mobile.lapdv.demomvp.screen.home.view;

import com.mobile.lapdv.demomvp.screen.home.model.Student;

import java.util.ArrayList;

/**
 * Created by lap on 26/04/2018.
 */

public interface HomeView {
    // Khai bao hanh dong cua View
    void showData(ArrayList<Student> students);

    void showError(String message);
}
