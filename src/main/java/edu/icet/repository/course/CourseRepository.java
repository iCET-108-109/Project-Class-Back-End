package edu.icet.repository.course;

import edu.icet.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CourseRepository extends JpaRepository<CourseEntity,String> {
}
