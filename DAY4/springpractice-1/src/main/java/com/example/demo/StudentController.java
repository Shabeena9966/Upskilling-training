package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class StudentController {
		
		@Autowired
		public StudentRepository studentRepository;
		
		@GetMapping(value="/all")
		public List<Student> getAllStudents() {		
			return studentRepository.findAll();		
		}
		
		@PostMapping(value="/create")
		public String createStudent(@RequestBody Student student) {		
			Student insertedStudent=studentRepository.insert(student);		
			return "Student created" + insertedStudent.getName();
		}

	}



