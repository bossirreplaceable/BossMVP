package com.aoss.bossmvp.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by YoBo on 2017/11/6.
 */

public class BasePresenter<T> {


    WeakReference<T> mWeakView;


    public void attachView(T view) {
        mWeakView = new WeakReference<T>(view);
    }

    public void detachView() {
        if (mWeakView != null) {
            mWeakView.clear();
        }
    }


}
