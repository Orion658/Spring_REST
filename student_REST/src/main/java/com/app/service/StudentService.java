package com.app.service;

import com.app.entity.Student;

public interface StudentService {
	String addStudent(Student student);
	
	String cancelStudentAdmission(Long courseId, Long studentId);
}
