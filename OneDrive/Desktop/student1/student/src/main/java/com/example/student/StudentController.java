package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>("New student has been added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/get-student-by-name/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String name){
        // Assign student by calling service layer method
        Student student = null;
        student = studentService.getStudent(name);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete-student-by-name")
    public ResponseEntity<String> deleteStudentByName(@RequestParam String studentName){
        studentService.deleteStudentByName(studentName);
        return new ResponseEntity<>(studentName + " removed successfully", HttpStatus.CREATED);
    }

    // getstudent
    // removestudent
}
