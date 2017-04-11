package com.example.bazinga.mvpstudy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.bazinga.mvpstudy.presenter.BasePresenter;

/**
 * Created by bazinga on 2017/4/11.
 */

public abstract  class MVPBaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity{
    private static final String TAG = "MVPBaseActivity";
    protected T mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mPresenter = createPresenter();

        mPresenter.attchView((V)this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    protected abstract T createPresenter();
}
