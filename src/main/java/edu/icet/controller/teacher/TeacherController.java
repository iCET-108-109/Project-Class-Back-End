package edu.icet.controller.teacher;

import edu.icet.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class TeacherController {

    final TeacherService teacherService;

    @GetMapping("/search-teacher/{subject}")
    public Object searchBySubject(@PathVariable String subject){
        TeacherEntity std = teacherService.searchTeacherBySubject(subject);

        return new ResponseEntity<>(std, HttpStatus.OK);
    }
}