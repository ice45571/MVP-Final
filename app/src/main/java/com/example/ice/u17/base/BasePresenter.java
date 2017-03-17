package com.example.ice.u17.base;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

public abstract class BasePresenter<M extends BaseModel, V extends BaseView>{

    private M model;
    private V view;
    protected abstract M createModel();

    public BasePresenter() {
        model = createModel();
    }

    protected M getModel(){
        return model;
    }

    protected V getView() {
        return view;
    }

    void bindView(V v) {
        view = v;
    }
}
