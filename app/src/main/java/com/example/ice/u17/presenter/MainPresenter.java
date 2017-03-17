package com.example.ice.u17.presenter;

import com.example.ice.u17.base.BaseBean;
import com.example.ice.u17.base.BasePresenter;
import com.example.ice.u17.bean.BoutiqueListNewBean;
import com.example.ice.u17.base.BaseModel;
import com.example.ice.u17.bean.TestBean;
import com.example.ice.u17.model.MainModel;
import com.example.ice.u17.view.MainActivity;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

public class MainPresenter extends BasePresenter<MainModel, MainActivity> implements BaseModel.OnLoadNetDataCompleteListener<BaseBean> {
    @Override
    protected MainModel createModel() {
        return new MainModel();
    }

    public void requestModeGetBoutiqueListNewBean() {
        getModel().getDataFromNet(this, BoutiqueListNewBean.class.getSimpleName());
    }

    public void requestModeGetTestBean() {
        getModel().getDataFromNet(this, TestBean.class.getSimpleName());
    }

    @Override
    public void onLoadNetDataComplete(BaseBean bean) {
        getView().showViewByDataFromNet(bean);
    }

}
