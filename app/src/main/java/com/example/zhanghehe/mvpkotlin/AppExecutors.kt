package com.example.zhanghehe.mvpkotlin

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.Executors

data class AppExecutors(val diskIO:Executor= Executors.newSingleThreadExecutor(),val networkIO:Executor=Executors.newFixedThreadPool(3),
                   val mainThread:Executor = MainThreadExecutor())

class MainThreadExecutor:Executor{
    var mainThreadHandler = Handler(Looper.getMainLooper())

    override fun execute(command: Runnable) {
        mainThreadHandler.post(command)
    }

}


