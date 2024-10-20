package edu.icet.service.teacher.impl;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.Teacher;
import edu.icet.repository.teacher.TeacherRepositary;
import edu.icet.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    final TeacherRepositary teacherRepositary;
    final ObjectMapper objectMapper;
    @Override
    public Teacher searchById(Integer id) {
        return objectMapper.convertValue(teacherRepositary.findById(id), Teacher.class);
    }
  	@Override
	public void saveTeacher(Teacher teacher) {
		repository.save(mapper.map(teacher, TeacherEntity.class));
	}
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
