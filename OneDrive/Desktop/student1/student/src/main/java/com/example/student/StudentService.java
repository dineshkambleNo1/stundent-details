package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.saveStudent(student);
    }

    public Student getStudent(String name) {
        return studentRepository.searchStudent(name);
    }

    public void deleteStudentByName(String studentName) {
        studentRepository.deleteStudentByName(studentName);
    }
}
