package edu.icet.repository.student;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
