package com.example.student;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {

    private static HashMap<String,Student> studentMap = new HashMap<>();

    //add_student
    public void saveStudent(Student student) {
        studentMap.put(student.getStudentName(),student);
    }

    // search_student
    public Student searchStudent(String studentName) {
        return studentMap.get(studentName);
    }

    public void deleteStudentByName(String studentName) {
        if(studentMap.containsKey(studentName))
        {
            studentMap.remove(studentName);
        }

        else {
            System.out.println("Student does not exists !!!");
        }
    }
}
