package com.jock.pickerview;

import android.app.Application;

import com.jock.pickerview.dao.DBManager;


public class MyAPP extends Application {
    private DBManager dbHelper;
    @Override
    public void onCreate() {
        super.onCreate();
        //导入数据库
        dbHelper = new DBManager(this);
        dbHelper.openDatabase();
//        dbHelper.closeDatabase();
    }
}
