package com.app.entities;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.*;

@Entity
@Table(name = "providerTable")
@Getter
@Setter
@ToString
public class Vehicle extends BaseEntity {

//	@Column(name = "id", unique = true, nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer Id;
	@Column(name = "v_number", length = 30, nullable = false)
	private String VehicleNumber;
	@Column(name = "v_type", length = 30, nullable = false)
	private VehicleType VehicleType;
//
//	@ManyToOne
//	private User user;
	
	
	
}
