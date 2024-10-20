package edu.icet.controller.teacher;

import edu.icet.dto.Teacher;
import edu.icet.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {
    final TeacherService teacherService;
    @GetMapping("/Search-By-Id/{id}")
    public Teacher searchById(@PathVariable Integer id){
        return teacherService.searchById(id);
    }
}
