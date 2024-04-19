package org.example.student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceMock implements StudentService {
    private List<Student> students = new ArrayList<>();

    public StudentServiceMock() {
        // Adding mock data
        students.add(new Student(1, "imene", "imene@gmail.com", 1));
        students.add(new Student(2, "mohamed", "mohamed@example.com", 2));
        students.add(new Student(3, "Alice", "alice@example.com", 3));
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
        return null; // Or throw exception if not found
    }

    @Override
    public List<Student> displayAllStudents() {
        return new ArrayList<>(students);
    }
}