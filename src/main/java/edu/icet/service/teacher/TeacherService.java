package edu.icet.service.teacher;

import edu.icet.dto.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> searchByName(String name);
}
