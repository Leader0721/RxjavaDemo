package com.example.android.rxjava.bean;

/**
 * description
 * author hanlei
 * version 1.0
 * created at 2017/12/27.
 */

public class Course {

    private String name;//课程名
    private String id;

    public Course(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
