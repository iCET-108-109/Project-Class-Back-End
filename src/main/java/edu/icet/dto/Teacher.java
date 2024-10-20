package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Teacher {
    private Integer id;
    private String subject;
    private String telephone;
    private LocalDate dob;
    private String gender;
    private Double salary;
    private String title;
    private String address;
}
