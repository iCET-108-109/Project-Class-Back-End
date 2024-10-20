package edu.icet.service.course.impl;

import edu.icet.model.Course;
import edu.icet.entity.CourseEntity;
import edu.icet.repository.course.CourseRepository;
import edu.icet.service.course.CourseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    final CourseRepository repository;
    final ModelMapper mapper;
    @Override
    public Boolean addCourse(Course course) {
        repository.save(mapper.map(course, CourseEntity.class));
        return true;
    }

    @Override
    public List<Course> addAllCourse() {
        List<CourseEntity> all = repository.findAll();
        List<Course> courses = new ArrayList<>();
        all.forEach(courseEntity -> {
            courses.add(mapper.map(courseEntity,Course.class));
        });
        if(!courses.isEmpty()){
            return courses;
        }
        return null;
    }
}
