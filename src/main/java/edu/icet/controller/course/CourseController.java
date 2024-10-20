package edu.icet.controller.course;

import edu.icet.dto.Course;
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

    @GetMapping("/search-by-id{id}")
    public Course searchById(@PathVariable String id){
       return service.searchById(id);
    }

    @GetMapping("/search-by-name{name}")
    public Course searchByName(@PathVariable String name){
        return service.searchByName(name);
    }


}
