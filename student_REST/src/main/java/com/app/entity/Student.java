package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends BaseEntity {
	
	@Column(length = 50)
    private String firstName;

	@Column(length = 50)
    private String lastName;

	@Column(length = 50)
    private String email;

    private double score;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

}