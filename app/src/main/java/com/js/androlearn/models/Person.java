package com.js.androlearn.models;

import java.util.jar.Attributes;

public class Person {

    private String Name;
    private int age;
    private float height;
    public Person(String pName,int pAge,float pHeight){
    Name=pName;
    age=pAge;
    height=pHeight;
    }

    public Person() {
        this("ansif",12,154f);
    }

    public Person(String name){
        Name=name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
