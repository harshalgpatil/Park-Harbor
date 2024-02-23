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
public class Admin extends BaseEntity {

//	@Column(name = "id", unique = true, nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer Id;
	@Column(name = "f_name", length = 30, nullable = false)
	private String FirstName;
	@Column(name = "l_name", length = 30, nullable = false)
	private String LastName;
	@Column(name = "email_id", length = 50, nullable = false, unique = true)
	private String EmailID;
	@Column(name = "dob", nullable = false)
	private LocalDate DateOfBirth;
	@Column(name = "password", length = 30, nullable = false, unique = true)
	private String Password;
	
//	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Admin> admin = new ArrayList<>();

//	public void addRailway(Railway r) {
//		rail.add(r);
//		r.setStation(this);
//	}
//	public void removeRailway(Railway r) {
//		rail.remove(r);
//		r.setStation(null);
//	}
	
}
