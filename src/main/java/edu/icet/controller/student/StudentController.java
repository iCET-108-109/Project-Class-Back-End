package edu.icet.controller.student;

import edu.icet.dto.Student;
import edu.icet.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public Student getById(@PathVariable Integer id) {
        return studentService.getById(id);

    }

    @PutMapping("/update-student")
    public void updateStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping("delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id) {
        studentService.deleteById(id);
    }
}
