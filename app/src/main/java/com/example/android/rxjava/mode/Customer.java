package com.example.android.rxjava.mode;

import android.util.Log;

/**
 * description
 * author hanlei
 * version 1.0
 * created at 2017/12/26.
 */

public class Customer implements Observer {

    private String name;
    private int edition;
    private float cost;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public void update(int edition, float cost) {
        this.edition = edition;
        this.cost = cost;
        notice();
    }

    public void notice(){
        Log.e("Customer","【" + name + "】收到消息：好消息，第【" + edition + "】期的杂志发布了，价格为【" + cost + "】元。");
    }

}
