package com.example.student;

public class Student {
    private String studentName;
    private int  admNo;
    private String standard;

    public Student(String studentName, int admNo, String standard) {
        this.studentName = studentName;
        this.admNo = admNo;
        this.standard = standard;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
