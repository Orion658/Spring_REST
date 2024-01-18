package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Course;
import com.app.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	 @Autowired
	 private CourseService courseService;
	
	 @PostMapping
	 public ResponseEntity<String> launchNewCourse(@RequestBody Course course) {
	     String response = courseService.launchNewCourse(course);
	     return new ResponseEntity<>(response, HttpStatus.OK);
	 }
	
	 @PutMapping("/{courseId}/fees/{fees}")
	 public ResponseEntity<String> updateCourseFees(@PathVariable Long courseId, @PathVariable double fees) {
	     String response = courseService.updateCourseFees(courseId, fees);
	     return new ResponseEntity<>(response, HttpStatus.OK);
	 }
}


