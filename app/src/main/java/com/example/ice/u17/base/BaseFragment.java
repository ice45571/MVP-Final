package com.example.ice.u17.base;

import android.content.Context;
import android.support.v4.app.Fragment;

import java.lang.ref.WeakReference;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

/**
 * BaseFragment have't test
 * @param <P>
 */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements BaseView {

    private WeakReference<P> weakReference;

    protected abstract P createPresenter();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        P presenter = createPresenter();
        weakReference = new WeakReference<>(presenter);
        presenter.bindView(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        weakReference.clear();
    }

    protected P getPresenter() {
        return weakReference.get();
    }

}
