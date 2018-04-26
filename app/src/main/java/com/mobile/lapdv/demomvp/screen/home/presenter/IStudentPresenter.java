package com.mobile.lapdv.demomvp.screen.home.presenter;

import com.mobile.lapdv.demomvp.base.BasePresenter;
import com.mobile.lapdv.demomvp.screen.home.view.HomeView;

/**
 * Created by lap on 26/04/2018.
 */

public interface IStudentPresenter extends BasePresenter<HomeView> {
    void loadData();
}
