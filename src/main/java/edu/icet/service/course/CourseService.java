package edu.icet.service.course;

import edu.icet.dto.Course;

import java.util.List;

public interface CourseService {
    Boolean addCourse(Course course);

    List<Course> addAllCourse();

    Course searchById(String id);

    Course searchByName(String name);
}
