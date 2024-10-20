package edu.icet.service.course;

import edu.icet.model.Course;

import java.util.List;

public interface CourseService {
    Boolean addCourse(Course course);

    List<Course> addAllCourse();

    Course searchById(String id);
}
