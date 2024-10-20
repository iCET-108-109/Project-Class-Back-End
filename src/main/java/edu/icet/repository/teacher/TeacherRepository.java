package edu.icet.repository.teacher;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer> {
    List<TeacherEntity> findByName(String name);
}
