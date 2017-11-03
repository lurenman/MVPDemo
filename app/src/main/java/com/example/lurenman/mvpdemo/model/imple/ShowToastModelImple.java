package com.example.lurenman.mvpdemo.model.imple;

import android.text.TextUtils;

import com.example.lurenman.mvpdemo.listener.OnShowToastListener;
import com.example.lurenman.mvpdemo.model.ShowToastModel;

/**
 * @author: baiyang.
 * Created on 2017/11/3.
 * SHowToastActivity逻辑业务层要干的事情
 */

public class ShowToastModelImple implements ShowToastModel {

    @Override
    public void showInfo(String msg, OnShowToastListener onShowToastListener) {
        if (!TextUtils.isEmpty(msg))
        {
            onShowToastListener.onShowToastInfo(msg+"调用成功了");
        }

    }
}
