package com.oneway.administrator.logutil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.oneway.log.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.i("这里是一个测试日志");
    }


}
