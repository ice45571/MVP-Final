package com.example.ice.u17.view;

import android.os.Bundle;

import com.example.ice.u17.R;
import com.example.ice.u17.base.BaseActivity;
import com.example.ice.u17.base.BaseBean;
import com.example.ice.u17.bean.BoutiqueListNewBean;
import com.example.ice.u17.bean.TestBean;
import com.example.ice.u17.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter>{

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPresenter().requestModeGetBoutiqueListNewBean();

    }

    @Override
    public void showViewByDataFromNet(BaseBean baseBean) {
        if (baseBean instanceof BoutiqueListNewBean) {
            getPresenter().requestModeGetTestBean();
        } else if (baseBean instanceof TestBean) {

        }
    }
}
