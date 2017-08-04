package com.yu.customizeview.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.yu.customizeview.R;
import com.yu.customizeview.activity.bezier.BezierCurveActivity;
import com.yu.customizeview.activity.guideview.GuideViewActivity;
import com.yu.customizeview.activity.qqmsgnotify.QQMsgNotifyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_bezier).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.this, BezierCurveActivity.class);
            }
        });

        findViewById(R.id.btn_qq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.this, QQMsgNotifyActivity.class);
            }
        });

        findViewById(R.id.btn_viewpager).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.this, GuideViewActivity.class);
            }
        });
    }

    private void startActivity(Context context, Class cls) {
        Intent intent = new Intent(context, cls);
        startActivity(intent);
    }
}
