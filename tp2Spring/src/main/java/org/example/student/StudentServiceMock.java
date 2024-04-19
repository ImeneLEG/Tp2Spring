package org.example.student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

private List<Student> students = new ArrayList<>();

public StudentServiceMock() {
    // Initialize mock data
    students.add(new Student(1, "John Doe", "john@example.com", 1));
    students.add(new Student(2, "Jane Smith", "jane@example.com", 2));
    students.add(new Student(3, "Alice Johnson", "alice@example.com", 3));
}

@Override
public void createStudent(Student student) {
    students.add(student);
}

@Override
public Student findById(int id) {
    for (Student student : students) {
        if (student.getId() == id) {
            return student;
        }
    }
    return null; // Return null if student with given id is not found
}

@Override
public void displayAllStudents() {
    for (Student student : students) {
        System.out.println(student);
    }
}

