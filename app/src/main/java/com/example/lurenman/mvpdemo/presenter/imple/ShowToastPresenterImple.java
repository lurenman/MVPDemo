package com.example.lurenman.mvpdemo.presenter.imple;

import com.example.lurenman.mvpdemo.listener.OnShowToastListener;
import com.example.lurenman.mvpdemo.model.imple.ShowToastModelImple;
import com.example.lurenman.mvpdemo.presenter.ShowToastPresenter;
import com.example.lurenman.mvpdemo.view.ShowToastView;

/**
 * @author: baiyang.
 * Created on 2017/11/3.
 * 这个就是负责activity中View层和逻辑层的交互的
 */

public class ShowToastPresenterImple implements ShowToastPresenter {
    private ShowToastView showToastView;
    private ShowToastModelImple showToastModelImple;

    public ShowToastPresenterImple(ShowToastView showToastView) {
        this.showToastView = showToastView;
        showToastModelImple=new ShowToastModelImple();
    }

    @Override
    public void onShowToastInfo() {
        if (showToastView!=null)
        {
            String activtyMessage = showToastView.getActivtyMessage();
            showToastModelImple.showInfo(activtyMessage, new OnShowToastListener() {
                @Override
                public void onShowToastInfo(String msg) {
                    showToastView.showMessage(msg);
                }
            });

        }
    }
}
