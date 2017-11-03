package com.example.lurenman.mvpdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lurenman.mvpdemo.R;
import com.example.lurenman.mvpdemo.presenter.imple.ShowToastPresenterImple;
import com.example.lurenman.mvpdemo.view.ShowToastView;

/**
 * @author: baiyang.
 * Created on 2017/11/2.
 */

public class ShowToastActivity extends Activity implements ShowToastView {
    private Button bt_click;
    private ShowToastPresenterImple showToastPresenterImple;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showtoast);
        bt_click = (Button) findViewById(R.id.bt_click);
        showToastPresenterImple=new ShowToastPresenterImple(this);

        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToastPresenterImple.onShowToastInfo();
            }
        });

    }

    @Override
    public String getActivtyMessage() {
        return "MVP模式";
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_SHORT).show();
    }
}
