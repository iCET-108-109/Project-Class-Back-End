package edu.icet.service.teacher;

import edu.icet.entity.TeacherEntity;

public interface TeacherService {
    TeacherEntity searchTeacherBySubject(String subject);
}
