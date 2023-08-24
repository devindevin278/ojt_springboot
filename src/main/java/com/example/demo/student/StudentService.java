package com.example.demo.student;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StudentService {
    
    public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1L, "Maria", "Maria@gmail.com", LocalDate.of(2000, 1, 1), 21));

		return students;
	}
}
