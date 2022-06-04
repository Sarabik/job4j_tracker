package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Anton Dorogov");
        student.setGroup("2A");
        student.setDate(LocalDate.of(2019, 9, 1));
        System.out.println("Student name: " + student.getFio() + System.lineSeparator()
        + "Group: " + student.getGroup() + System.lineSeparator()
        + "Start date of study: " + student.getDate());
    }
}
