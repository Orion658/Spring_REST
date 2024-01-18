package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudentRepository;
import com.app.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String addStudent(Student student) {
        // Add logic to check admission and save student details
        if (student.getScore() >= student.getCourse().getMinScore()) {
            studentRepository.save(student);
            return "Student admitted successfully.";
        } else {
            return "Admission rejected due to low score.";
        }
    }

    @Override
    public String cancelStudentAdmission(Long courseId, Long studentId) {
        // Add logic to cancel student admission
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        if (optionalStudent.isPresent() && optionalStudent.get().getCourse().getId().equals(courseId)) {
            studentRepository.deleteById(studentId);
            return "Student admission canceled successfully.";
        } else {
            return "Student not found or not associated with the specified course.";
        }
    }
}