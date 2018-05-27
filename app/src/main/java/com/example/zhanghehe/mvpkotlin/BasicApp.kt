package com.example.zhanghehe.mvpkotlin

import android.app.Application

class BasicApp :Application(){


    private lateinit var mAppExecutor: AppExecutors


    override fun onCreate() {
        super.onCreate()

        mAppExecutor=AppExecutors()
    }

    // TODO: 2018/5/27 database


    // TODO: 2018/5/27 datarepository


}