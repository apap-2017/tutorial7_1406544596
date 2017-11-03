package com.example.service;

import java.util.List;

import com.example.model.StudentModel;
import com.example.model.CourseModel;

public interface StudentService
{
    StudentModel selectStudent (String npm);


    List<StudentModel> selectAllStudents ();


    void addStudent (StudentModel student);


    void deleteStudent (String npm);
    
    
    void updateStudent (StudentModel student);
    
    
    CourseModel selectCourse (String id_course);
    
    void addCourse(String npm, String id_course);
}