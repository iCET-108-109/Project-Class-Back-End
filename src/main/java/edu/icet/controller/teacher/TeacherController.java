package edu.icet.controller.teacher;

import edu.icet.dto.Teacher;
import edu.icet.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    final TeacherService service;

    @GetMapping("/search-by-name/{name}")
    public List<Teacher> searchByName(@PathVariable String name){
        return service.searchByName(name);
    }


}
