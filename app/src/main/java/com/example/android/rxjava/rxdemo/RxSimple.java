package com.example.android.rxjava.rxdemo;


import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * description
 * author hanlei
 * version 1.0
 * created at 2017/12/27.
 */

public class RxSimple {

    private static final String TAG = "RxChain";

    public static void rx1(){


        Observable.fromArray(1,2,3,4,5,6).
                subscribe(new Observer<Integer>() {

            @Override
            public void onSubscribe(Disposable d) {
                Log.e(TAG, "subscribe");
            }

            @Override
            public void onNext(Integer value) {
                Log.e(TAG, "" + value);
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "error");
            }

            @Override
            public void onComplete() {
                Log.e(TAG, "complete");
            }
        });
    }
}
