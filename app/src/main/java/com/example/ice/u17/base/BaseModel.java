package com.example.ice.u17.base;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

public interface BaseModel {

    void getDataFromNet(OnLoadNetCompleteListener onLoadCompleteListener, String className);

    interface OnLoadNetCompleteListener<B extends BaseBean> {
        void onLoadNetComplete(B bean);
    }
}
