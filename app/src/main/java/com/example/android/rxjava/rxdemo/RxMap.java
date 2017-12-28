package com.example.android.rxjava.rxdemo;


import android.util.Log;

import com.example.android.rxjava.bean.Course;
import com.example.android.rxjava.bean.Student;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/**
 * description
 * author hanlei
 * version 1.0
 * created at 2017/12/27.
 */

public class RxMap {

    private static final String TAG = "RxMap";


    public static void rx1(final String str){

        Observable.fromArray(str).map(new Function<String, Boolean>() { // 此处演示一下多重转换

            @Override
            public Boolean apply(String s) throws Exception {
                return "bcbook".equals(str);
            }

        }).subscribe(new Consumer<Boolean>() {

            @Override
            public void accept(Boolean aBoolean) throws Exception {
                Log.e(TAG, str+"-----验明正身："+aBoolean);
            }

        });
    }


    public static void rx2(final String str){

        Student student = getStudent(str);

        Observable.just(student).flatMap(new Function<Student, ObservableSource<Course>>() {
            @Override
            public ObservableSource<Course> apply(Student student) throws Exception {

                if ("黑名单".equals(student.getName())){
                    return  Observable.error(new RuntimeException("此学生异常"));
                }
                return  Observable.just(student.getCourse());
            }
        }).map(new Function<Course, String>() {
            @Override
            public String apply(Course course) throws Exception {
                return course.getName();
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                Log.e(TAG, str+"-----课程是："+s);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                Log.e(TAG, str+"-----发现问题："+throwable.getMessage());
            }
        });
    }

    public static  Student getStudent(String name){

        return new Student(name,new Course("数学","sx"));

    }
}
