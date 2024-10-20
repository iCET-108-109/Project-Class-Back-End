package edu.icet.controller.student;

import edu.icet.dto.Student;
import edu.icet.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/get-by-id/{id}")
    public Student getById(@PathVariable Integer id){
        return studentService.getById(id);
    }
}
