package edu.icet.service.course.impl;

import edu.icet.model.Course;
import edu.icet.entity.CourseEntity;
import edu.icet.repository.course.AddCourseRepository;
import edu.icet.service.course.AddCourseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddCourseServiceImpl implements AddCourseService {

    final AddCourseRepository repository;
    final ModelMapper mapper;
    @Override
    public Boolean addCourse(Course course) {
        repository.save(mapper.map(course, CourseEntity.class));
        return true;
    }
}
