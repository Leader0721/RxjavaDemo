package com.example.android.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.android.rxjava.mode.Customer;
import com.example.android.rxjava.mode.MagazineData;
import com.example.android.rxjava.mode.Observer;
import com.example.android.rxjava.rxdemo.RxMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void buttonClick(View v) {

        Log.e("MainActivity", "按键按下");
        RxMap.rx2("黑名单");
    }

    private void obMode(){

        //创建被观察者
        MagazineData magazine = new MagazineData();
        //创建三个不同的观察者
        Observer customerA = new Customer("A");
        Observer customerB = new Customer("B");
        Observer customerC = new Customer("C");

        //将观察者注册到被观察者中
        magazine.registerObserver(customerA);
        magazine.registerObserver(customerB);
        magazine.registerObserver(customerC);

        //更新被观察者中的数据，当数据更新后，会自动通知所有已注册的观察者
        magazine.setInfomation(5, 12);
    }


//    private void obMode2(){
//
//        //创建被观察者
//        JournalData journal = new JournalData();
//        //创建三个不同的观察者
//        Customer consumerA = new Customer("A");
//        Customer consumerB = new Customer("B");
//        Customer consumerC = new Customer("C");
//        //将观察者注册到被观察者中
//        journal.addObserver(consumerA);
//        journal.addObserver(consumerB);
//        journal.addObserver(consumerC);
//        //更新被观察者中的数据
//        journal.setInfomation(6, 11);
//    }


}
