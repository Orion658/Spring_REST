package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.service.StudentService;

//StudentController.java
@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
	   String response = studentService.addStudent(student);
	   return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/{courseId}/students/{studentId}")
	public ResponseEntity<String> cancelStudentAdmission(@PathVariable Long courseId, @PathVariable Long studentId) {
	   String response = studentService.cancelStudentAdmission(courseId, studentId);
	   return new ResponseEntity<>(response, HttpStatus.OK);
	}
}


