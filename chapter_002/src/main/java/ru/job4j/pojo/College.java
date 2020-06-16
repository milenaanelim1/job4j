package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args){
        Student student = new Student();
        student.setInitials("Ivanov Ivan Ivanovich");
        student.setGroup("Group №2");
        student.setDate("27 nov 2004");
        student.setCreated(new Date());

        System.out.println(student.getInitials()+" in "+student.getGroup()+", since "+student.getDate());
    }
}
