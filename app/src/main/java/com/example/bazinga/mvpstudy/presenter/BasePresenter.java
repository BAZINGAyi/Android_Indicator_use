package com.example.bazinga.mvpstudy.presenter;

import android.util.Log;

import com.example.bazinga.mvpstudy.view.IfoodView;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/**
 * Created by bazinga on 2017/4/11.
 */

public abstract class BasePresenter<T>  {

    protected WeakReference<T> mViewRef;

    public void attchView(T view){
        mViewRef = new WeakReference<T>(view);
    }

    public void detachView(){
        if(mViewRef != null){
            mViewRef.clear();
            mViewRef = null;
            Log.i("BasePresenter"," 已经 Gc ....");
        }
    }
    public T getView() {
        return mViewRef.get();
    }
}
