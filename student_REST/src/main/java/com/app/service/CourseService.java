package com.app.service;

import com.app.entity.Course;


public interface CourseService {
 String launchNewCourse(Course course);

 String updateCourseFees(Long courseId, double fees);
}


