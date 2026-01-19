package com.example.day2part2.controller;

import com.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class home {

    @GetMapping("/")
    public ArrayList<StudentModel> getStudent() {

        StudentModel student1 = new StudentModel(1, "Ansh", "ansh@gmail.com");
        StudentModel student2 = new StudentModel(2, "Arpit", "arpit@gmail.com");
        StudentModel student3 = new StudentModel(3, "Rahul", "rahul@gmail.com");
        StudentModel student4 = new StudentModel(4, "Neha", "neha@gmail.com");
        StudentModel student5 = new StudentModel(5, "Priya", "priya@gmail.com");

        ArrayList<StudentModel> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        return students;
    }
}
