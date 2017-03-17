package com.example.ice.u17.api;

import android.util.Log;

import com.example.ice.u17.base.BaseResult;
import com.example.ice.u17.bean.BoutiqueListNewBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

public class HomeApi {
    public static void getBoutiqueListNewBean(final CustomCallBack<BoutiqueListNewBean> customCallBack) {
        Api.getHomeService().getBoutiqueListNewBean().enqueue(new Callback<BaseResult<BoutiqueListNewBean>>() {
            @Override
            public void onResponse(Call<BaseResult<BoutiqueListNewBean>> call, Response<BaseResult<BoutiqueListNewBean>> response) {
                customCallBack.onSuccess(response.body().data.returnData);
            }

            @Override
            public void onFailure(Call<BaseResult<BoutiqueListNewBean>> call, Throwable t) {
                Log.e("TAG", "onFailure: ");
            }
        });
    }
}
