package edu.icet.controller.course;

import edu.icet.model.Course;
import edu.icet.service.course.AddCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class AddCourseController {

    final AddCourseService service;

    @PostMapping("/add-course")
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean addCourse(@RequestBody Course course){
       return service.addCourse(course);

    }
}
