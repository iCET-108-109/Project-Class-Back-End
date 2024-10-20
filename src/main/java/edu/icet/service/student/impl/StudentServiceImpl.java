package edu.icet.service.student.impl;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.student.StudentRepository;
import edu.icet.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    final StudentRepository studentRepository;
    final ModelMapper modelMapper;
  
    @Override
    public void addStudent(Student student) {
        studentRepository.save(modelMapper.map(student, StudentEntity.class));
    }
    @Override
    public Student getById(Integer id) {
        return modelMapper.map(studentRepository.findById(id),Student.class);
    }
      @Override
    public List<Student> getAllStudent() {
       List<Student> studentList=new ArrayList<>();
       repository.findAll().forEach(studentEntity -> {

           studentList.add( new ModelMapper().map(studentEntity, Student.class));

       });
       return studentList;
    }

    @Override
    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }
}
