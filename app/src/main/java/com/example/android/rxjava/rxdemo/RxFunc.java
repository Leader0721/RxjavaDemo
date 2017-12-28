package com.example.android.rxjava.rxdemo;


import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * description
 * author hanlei
 * version 1.0
 * created at 2017/12/27.
 */

public class RxFunc {

    private static final String TAG = "RxFunc";

    public static void rx1(){

        Observable.fromArray(1,2,3).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                Log.e(TAG, "" + integer);
            }
        });
    }

    public static void rx2(){

        Observable.fromArray(1,2,3).subscribe(new Consumer<Integer>() {

            @Override
            public void accept(Integer integer) throws Exception {

                if (integer == 2){
                    String[] sArray = new String[]{"a","b"};
                    String value = sArray[9];
                    Log.e(TAG, "" + value);
                }

                Log.e(TAG, "" + integer);

            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                Log.e(TAG, "" + throwable.toString());
            }
        });
    }

    public static void rx3(){

        Observable.fromArray(1,2,3).doOnNext(new Consumer<Integer>() {

            @Override
            public void accept(Integer integer) throws Exception {
                Log.e(TAG, "" + integer);
            }

        }).doOnError(new Consumer<Throwable>() {

            @Override
            public void accept(Throwable throwable) throws Exception {
                Log.e(TAG, "" + throwable.toString());
            }

        }).subscribe();
    }
}
