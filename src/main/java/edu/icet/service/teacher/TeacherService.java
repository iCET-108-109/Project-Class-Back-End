package edu.icet.service.teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> searchByName(String name);
}
