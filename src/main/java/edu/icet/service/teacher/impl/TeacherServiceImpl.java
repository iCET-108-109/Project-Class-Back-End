package edu.icet.service.teacher.impl;

import edu.icet.dto.Teacher;
import edu.icet.entity.TeacherEntity;
import edu.icet.repository.teacher.TeacherRepository;
import edu.icet.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TeacherServiceImpl implements TeacherService {

	final ModelMapper mapper;
	final TeacherRepository repository;

	@Override
	public void saveTeacher(Teacher teacher) {
		repository.save(mapper.map(teacher, TeacherEntity.class));
	}
}
