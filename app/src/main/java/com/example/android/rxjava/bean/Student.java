package com.example.android.rxjava.bean;

/**
 * description
 * author hanlei
 * version 1.0
 * created at 2017/12/27.
 */

public class Student {

    private String name;//姓名
    private Course course;//所修的课程


    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
