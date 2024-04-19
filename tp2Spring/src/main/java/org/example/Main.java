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

        Student student1 = new Student(1, "imene legsir");
        Student student2 = new Student(2, "mohamed legsir");

        studentService.createStudent(student1);
        studentService.createStudent(student2);

        studentService.displayAllStudents();
    }
}
