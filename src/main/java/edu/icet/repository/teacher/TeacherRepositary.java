package edu.icet.repository.teacher;

import edu.icet.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepositary extends JpaRepository<TeacherEntity, Integer> {

}
