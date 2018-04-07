package com.example.luogj.webviewdemo;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {
    private Context context;
    private WebView wv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        initView();
    }

    /**
     * 初始化界面
     */
    private void initView() {
        wv_content = findViewById(R.id.wv_content);
    }
}
