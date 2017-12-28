package com.example.android.rxjava.mode;


/**
 * description
 * author hanlei
 * version 1.0
 * created at 2017/12/26.
 */

public interface Observerable {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}

