package com.app.entities;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.*;

@MappedSuperclass
@Entity
@Table(name = "userTable")
@Getter
@Setter
@ToString
public class Booking extends BaseEntity {

//	@Column(name = "id", unique = true, nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer Id;
	@Column(name = "dobook", nullable = false)
	private LocalDate DateOfBooking;
	@Column(name = "tobook", nullable = false)
	private LocalTime TimeOfBooking;
	@Column(name = "v_number", length = 30, nullable = false)
	private String VehicleNumber;
	
//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<User> user = new ArrayList<>();
	
//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Vehicle> vehicle = new ArrayList<>();
//
//	@OneToMany
//	private User user;
//	
//	@OneToMany
//	private Provider provider;
	
//	public void addUser(User u) {
//		user.add(u);
//		u.setUser(this);
//	}
//	public void removeUser(User u) {
//		user.remove(u);
//		u.setUser(null);
//	}
	

}
