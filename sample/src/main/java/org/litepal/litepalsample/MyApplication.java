package org.litepal.litepalsample;

import android.app.Application;

import org.litepal.LitePal;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化数据库模块
        LitePal.initialize(this);
    }
}
