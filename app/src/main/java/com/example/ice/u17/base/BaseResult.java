package com.example.ice.u17.base;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

public class BaseResult<T> {
    public int code;
    public Data<T> data;

    public static class Data<T> {
        public String message;
        public int stateCode;
        public T returnData;
    }
}