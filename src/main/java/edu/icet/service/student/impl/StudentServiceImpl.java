package edu.icet.service.student.impl;

import edu.icet.dto.Student;
import edu.icet.repository.student.StudentRepository;
import edu.icet.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    final StudentRepository repository;

    @Override
    public List<Student> getAllStudent() {
       List<Student> studentList=new ArrayList<>();
       repository.findAll().forEach(studentEntity -> {

           studentList.add( new ModelMapper().map(studentEntity, Student.class));

       });
       return studentList;
    }
}
