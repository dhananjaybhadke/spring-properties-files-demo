package com.springcore;

public class Student {

    private String name;
    private String interestedCourse;
    private String hobby;

    public void setName(String name) {
        this.name = name;
    }

    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void getStudentInfo(){
        System.out.println("Student name is "+name);
        System.out.println("Student is interested in  "+interestedCourse);
        System.out.println("Student having hobby "+hobby);

    }

}
