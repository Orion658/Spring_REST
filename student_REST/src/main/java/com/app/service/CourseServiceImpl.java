package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CourseRepository;
import com.app.entity.Course;


@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public String launchNewCourse(Course course) {
        // Add logic to save the course details
        courseRepository.save(course);
        return "Course launched successfully.";
    }

    @Override
    public String updateCourseFees(Long courseId, double fees) {
        // Add logic to update course fees
        Optional<Course> optionalCourse = courseRepository.findById(courseId);
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            course.setFees(fees);
            courseRepository.save(course);
            return "Course fees updated successfully.";
        } else {
            return "Course not found.";
        }
    }
}
