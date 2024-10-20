package edu.icet.repository.course;

import edu.icet.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdateCourseRepository extends JpaRepository<CourseEntity, String> {

}
