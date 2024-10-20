package edu.icet.repository.teacher;

import edu.icet.entity.TeacherEntity;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<TeacherEntity,Integer> {
}
