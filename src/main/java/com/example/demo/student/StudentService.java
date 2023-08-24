package com.example.demo.student;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
    
    public List<Student> getStudents() {

		return studentRepository.findAll();
	}
}
