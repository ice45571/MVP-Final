package com.example.ice.u17.base;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

public interface BaseModel {

    void getDataFromNet(OnLoadNetDataCompleteListener onLoadNetDataCompleteListener, String dataName);

    interface OnLoadNetDataCompleteListener<B extends BaseBean> {
        void onLoadNetDataComplete(B bean);
    }
}
