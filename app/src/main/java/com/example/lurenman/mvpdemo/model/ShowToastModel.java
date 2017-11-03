package com.example.lurenman.mvpdemo.model;

import com.example.lurenman.mvpdemo.listener.OnShowToastListener;

/**
 * @author: baiyang.
 * Created on 2017/11/3.
 * 这是要处理的逻辑层
 * 再搞个OnShowToastListener回调给Presenter层
 */

public interface ShowToastModel {
    void showInfo(String msg, OnShowToastListener onShowToastListener);
}
