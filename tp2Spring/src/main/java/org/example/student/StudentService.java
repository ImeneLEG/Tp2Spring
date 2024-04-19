package org.example.student;

import java.util.List;

public interface StudentService {
    void createStudent(Student student);
    Student findById(int id);
    List<Student> displayAllStudents();
}