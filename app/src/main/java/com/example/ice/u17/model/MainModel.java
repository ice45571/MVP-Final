package com.example.ice.u17.model;

import com.example.ice.u17.api.CustomCallBack;
import com.example.ice.u17.api.HomeApi;
import com.example.ice.u17.base.BaseModel;
import com.example.ice.u17.bean.BoutiqueListNewBean;
import com.example.ice.u17.bean.TestBean;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

public class MainModel implements BaseModel {
    @Override
    public void getDataFromNet(final OnLoadNetCompleteListener onLoadCompleteListener, String className) {
        if (className.equals(BoutiqueListNewBean.class.getSimpleName())) {
            HomeApi.getBoutiqueListNewBean(new CustomCallBack<BoutiqueListNewBean>() {
                @Override
                public void onSuccess(BoutiqueListNewBean boutiqueListNewBean) {
                    onLoadCompleteListener.onLoadNetComplete(boutiqueListNewBean);
                }
            });
        } else if (className.equals(TestBean.class.getSimpleName())) {
            onLoadCompleteListener.onLoadNetComplete(new TestBean());
        }
    }
}
