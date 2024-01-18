package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.StudentRepository;
import com.app.entity.Student;

@RestController
@RequestMapping("/students")
public class CourseStudentController {
		@Autowired
		private StudentRepository studentRepository;
		
		@GetMapping("/course_title/{title}")
		public ResponseEntity<List<Student>> getAllStudentsForCourse(@PathVariable String title) {
		List<Student> students = studentRepository.findByCourseTitle(title);
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
}
