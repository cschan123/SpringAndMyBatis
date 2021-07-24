package com.powernode.entity;

public class Student {
    private String name;
    private int id;

    private School school;

    public Student(String name, int id, School myschool) {
        System.out.println("有参构造");
        this.name = name;
        this.id = id;
        this.school = myschool;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public Student() {
        System.out.println("Student无参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", school=" + school +
                '}';
    }
}
