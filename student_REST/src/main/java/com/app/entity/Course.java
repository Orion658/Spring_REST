package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course  extends BaseEntity{
    
    @Column(unique = true)
    private String title;

    private LocalDate startDate;

    private LocalDate endDate;

    private double fees;

    private int minScore;

}