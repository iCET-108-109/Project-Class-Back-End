package edu.icet.controller.teacher;

import edu.icet.dto.Teacher;
import edu.icet.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {
    final TeacherService teacherService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Teacher teacher){
        teacherService.saveTeacher(teacher);
    }

}
