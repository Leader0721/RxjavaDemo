package com.example.android.rxjava.mode2;

import java.util.Observable;

/**
 * description
 * author hanlei
 * version 1.0
 * created at 2017/12/26.
 */

public class JournalData extends Observable {
    private int edition;
    private float cost;

    public void setInfomation(int edition,float cost){
        this.edition = edition;
        this.cost = cost;
        setChanged();
        //调用无参数的方法，使用拉模型
        notifyObservers();
    }

    //提供get方法
    public int getEdition(){
        return edition;
    }

    public float getCost(){
        return cost;
    }
}