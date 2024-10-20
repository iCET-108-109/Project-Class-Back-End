package edu.icet.service.course.impl;

import edu.icet.entity.CourseEntity;
import edu.icet.model.Course;
import edu.icet.repository.course.UpdateCourseRepository;
import edu.icet.service.course.UpdateCourseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateCourseServiceImpl implements UpdateCourseService {

    final UpdateCourseRepository repository;
    final ModelMapper mapper;

    @Override
    public Boolean updateCourse(Course course) {
        CourseEntity entity = mapper.map(course, CourseEntity.class);
        repository.save(entity);
        return true;
    }
}
