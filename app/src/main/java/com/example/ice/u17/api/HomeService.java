package com.example.ice.u17.api;

import com.example.ice.u17.base.BaseResult;
import com.example.ice.u17.bean.BoutiqueListNewBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

public interface HomeService {
    @GET("v3/appV3_2/android/phone/comic/boutiqueListNew")
    Call<BaseResult<BoutiqueListNewBean>> getBoutiqueListNewBean();
}
