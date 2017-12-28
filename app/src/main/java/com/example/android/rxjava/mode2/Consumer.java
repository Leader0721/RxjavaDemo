package com.example.android.rxjava.mode2;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * description
 * author hanlei
 * version 1.0
 * created at 2017/12/26.
 */

public class Consumer implements Observer {

    private String name;
    private int edition;
    private float cost;

    public Consumer(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        //判断o是否是JournalData的一个实例
        if(o instanceof JournalData){
            //强制转化为JournalData类型
            JournalData journalData = (JournalData) o;
            //拉取数据
            this.edition = journalData.getEdition();
            this.cost = journalData.getCost();
            notice();
        }

    }

    public void notice(){
        Log.e("Consumer","【" + name + "】收到消息：好消息，第【" + edition + "】期的杂志发布了，价格为【" + cost + "】元。");
    }

}

