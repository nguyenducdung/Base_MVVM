package com.dungnd.baseapp.ui.splash;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.dungnd.baseapp.R;
import com.dungnd.baseapp.ui.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
    }
}
