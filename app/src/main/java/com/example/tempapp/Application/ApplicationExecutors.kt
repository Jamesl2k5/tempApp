package com.example.tempapp.Application

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class ApplicationExecutors {

    private val mDiskIO = Executors.newSingleThreadExecutor()

    private val mMainThreadExecutor = MainThreadExecutor()


    fun diskIO(): Executor {
        return mDiskIO
    }

    fun mainThread(): Executor {
        return mMainThreadExecutor
    }

    private class MainThreadExecutor : Executor {

        private val mainThreadHandler = Handler(Looper.getMainLooper())

        override fun execute(command: Runnable) {
            mainThreadHandler.post(command)
        }
    }

    companion object {

        private var instance: ApplicationExecutors? = null

        fun getInstance(): ApplicationExecutors {
            if (instance == null) {
                instance = ApplicationExecutors()
            }
            return instance
        }
    }
}