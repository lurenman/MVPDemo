package com.example.lurenman.mvpdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.lurenman.mvpdemo.activity.ShowToastActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tv_mvp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_mvp = (TextView) findViewById(R.id.tv_mvp);
        tv_mvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShowToastActivity.class);
                startActivity(intent);
            }
        });

    }
}
