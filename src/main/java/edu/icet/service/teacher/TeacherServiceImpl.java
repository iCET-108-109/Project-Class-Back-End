package edu.icet.service.teacher;

import edu.icet.repository.teacher.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService{

    final TeacherRepository repository;
    final ModelMapper mapper;

    @Override
    public List<Teacher> searchByName(String name) {
        List<Teacher> teachers = new ArrayList<>();
        repository.findByName(name).forEach(entity -> {
            teachers.add(mapper.map(entity,Teacher.class));
        });
        return teachers;

    }
}
