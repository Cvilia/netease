package com.cvilia.netease.activity.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cvilia.netease.config.PageUrlConfig;
import com.cvilia.netease.databinding.ActivityMainBinding;

@Route(path = PageUrlConfig.MAIN_PAGE)
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mViewBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBind = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mViewBind.getRoot();
        setContentView(view);
    }
}