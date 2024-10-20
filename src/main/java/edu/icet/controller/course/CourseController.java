package edu.icet.controller.course;

import edu.icet.model.Course;
import edu.icet.service.course.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CourseController {

    final CourseService service;

    @PostMapping("/add-course")
    @ResponseStatus(HttpStatus.CREATED)

    public Boolean addCourse(@RequestBody Course course){
       return service.addCourse(course);
    }

    @GetMapping("/view-all")
    public List<Course> viewAllCourse(){
       return service.addAllCourse();
    }
}
