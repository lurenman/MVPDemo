package com.example.lurenman.mvpdemo.view;

/**
 * @author: baiyang.
 * Created on 2017/11/2.
 * 这个就是那个activity中View要干的事情
 */

public interface ShowToastView {
     String getActivtyMessage();//获取activity的信息
     void showMessage(String msg);
}
