package edu.icet.controller.teacher;
import edu.icet.dto.Teacher;
import edu.icet.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TeacherController {
    final TeacherService teacherService;
    @GetMapping("/search-teacher/{subject}")
    public Object searchBySubject(@PathVariable String subject){
        TeacherEntity std = teacherService.searchTeacherBySubject(subject);

        return new ResponseEntity<>(std, HttpStatus.OK);
    }
}
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Teacher teacher){
        teacherService.saveTeacher(teacher);
    }
    @GetMapping("/Search-By-Id/{id}")
    public Teacher searchById(@PathVariable Integer id){
        return teacherService.searchById(id);
    }

}
