package edu.icet.service.teacher;

import edu.icet.dto.Teacher;

public interface TeacherService {
	void saveTeacher(Teacher teacher);
    Teacher searchById(Integer id);
}
