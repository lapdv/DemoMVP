package com.mobile.lapdv.demomvp.base;

/**
 * Created by lap on 26/04/2018.
 */

public interface BasePresenter<T> {
    void setOnView(T view);

    void onStart();
}
