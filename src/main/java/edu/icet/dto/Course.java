package edu.icet.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String id;
    private String name;
    private Double fees;
    private String description;

}
