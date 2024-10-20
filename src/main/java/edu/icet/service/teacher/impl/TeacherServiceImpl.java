package edu.icet.service.teacher.impl;

import edu.icet.entity.TeacherEntity;
import edu.icet.repository.teacher.TeacherRepository;
import edu.icet.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    final TeacherRepository teacherRepository;

    @Override
    public TeacherEntity searchTeacherBySubject(String subject) {
        Iterable<TeacherEntity> all = teacherRepository.findAll();
        TeacherEntity teacher = null;
        for(TeacherEntity teacherEntity:all){
            if (teacherEntity.getSubject().equalsIgnoreCase(subject)){
                teacher = teacherEntity;
            }
        }
        return teacher;
    }
}
