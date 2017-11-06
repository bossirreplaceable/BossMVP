package com.aoss.bossmvp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.aoss.bossmvp.presenter.BasePresenter;

/**
 * Created by YoBo on 2017/11/6.
 */

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends AppCompatActivity {

    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.attachView((V) this);
    }

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
