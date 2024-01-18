package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class Product extends BaseEntity {

	@NotBlank(message = "Name cannot be blank")
	@Column(length = 50)
	private String name;

	@NotBlank(message = "Product code cannot be blank")
	@Column(unique = true, length = 20)
	private String productCode;

	@NotNull(message = "Date of manufacturing cannot be null")
	private LocalDate dateOfManufacturing;

	@Enumerated(EnumType.STRING)
	private Category category;
}
