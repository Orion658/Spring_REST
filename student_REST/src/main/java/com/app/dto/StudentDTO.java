package com.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {
    private String firstName;
    private String lastName;
    private String email;
    private double score;
    private Long courseId; 

}
