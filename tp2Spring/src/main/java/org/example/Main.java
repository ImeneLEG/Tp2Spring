package org.example;

import org.example.student.ApplicationConfig;
import org.example.student.Student;
import org.example.student.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        StudentService studentService = context.getBean(StudentService.class);

        Student student1 = new Student(4, "Bob Brown", "bob@example.com", 2);
        studentService.createStudent(student1);

        Student retrievedStudent = studentService.findById(1);
        System.out.println("Retrieved Student: " + retrievedStudent);

        System.out.println("All Students:");
        studentService.displayAllStudents();
    }
}