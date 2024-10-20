package edu.icet.service.student;

import edu.icet.dto.Student;

public interface StudentService {
    void addStudent(Student student);
    Student getById(Integer id);
 List<Student> getAllStudent();
    void deleteById(Integer id);
}
