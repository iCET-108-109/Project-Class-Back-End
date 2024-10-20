package edu.icet.service.student;

import edu.icet.dto.Student;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudent();
}
