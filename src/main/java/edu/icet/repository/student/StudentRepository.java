package edu.icet.repository.student;

import edu.icet.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity,Integer > {
}
