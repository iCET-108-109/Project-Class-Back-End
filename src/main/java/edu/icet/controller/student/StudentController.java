package edu.icet.controller.student;

import edu.icet.dto.Student;
import edu.icet.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {

    final StudentService service;
    @GetMapping("/student/get-all")
    public List<Student> findAllStudent(){
        return service.getAllStudent();
    }
}
