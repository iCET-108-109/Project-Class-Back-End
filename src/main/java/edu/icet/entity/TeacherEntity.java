package edu.icet.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class TeacherEntity {
    private Integer id;
    private String name;
    private String subject;
    private String telephone;
    private LocalDate dob;
    private String gender;
    private Double salary;
    private String title;
    private String address;
}
