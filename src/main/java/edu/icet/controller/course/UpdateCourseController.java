package edu.icet.controller.course;

import edu.icet.model.Course;
import edu.icet.service.course.UpdateCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class UpdateCourseController {

    final UpdateCourseService updateCourseService;

    @PutMapping("/update-course")
    @ResponseStatus(HttpStatus.OK)
    public Boolean updateCourse(@RequestBody Course course) {
        return updateCourseService.updateCourse(course);
    }
}
