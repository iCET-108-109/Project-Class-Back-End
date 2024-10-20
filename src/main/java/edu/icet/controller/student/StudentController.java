package edu.icet.controller.student;

import edu.icet.dto.Student;
import edu.icet.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    final StudentService studentService;

    @PostMapping("/add-student")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }
      @GetMapping("/get-by-id/{id}")
    public Student getById(@PathVariable Integer id){
        return studentService.getById(id);

    }
}
