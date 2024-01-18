package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie extends BaseEntity {

    @Column(name = "title", length = 40, unique = true)
    private String title;

    @Column(name = "rel_date")
    private LocalDate relDate;
}


