package com.example.asynctask;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public abstract class SimpleAsyncTask extends AsyncTask <Void, Void, String> {
    private WeakReference<TextView> mTextview;

    SimpleAsyncTask(TextView tv){
        mTextview = new WeakReference<>(tv);
    }
}


