package edu.icet.service.student;

import edu.icet.dto.Student;

public interface StudentService {
    void addStudent(Student student);
    Student getById(Integer id);

    void deleteById(Integer id);
}
