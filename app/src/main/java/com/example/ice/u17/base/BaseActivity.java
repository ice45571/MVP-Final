package com.example.ice.u17.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.lang.ref.WeakReference;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    private WeakReference<P> weakReference;

    protected abstract P createPresenter();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        P presenter = createPresenter();
        weakReference = new WeakReference<>(presenter);
        presenter.bindView(this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        weakReference.clear();
    }

    protected P getPresenter() {
        return weakReference.get();
    }

}
