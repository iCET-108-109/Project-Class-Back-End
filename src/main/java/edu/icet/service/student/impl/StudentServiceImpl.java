package edu.icet.service.student.impl;

import edu.icet.dto.Student;
import edu.icet.repository.student.StudentRepository;
import edu.icet.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper mapper;

    @Override
    public Student getById(Integer id) {
        return mapper.map(studentRepository.findById(id),Student.class);
    }
}
