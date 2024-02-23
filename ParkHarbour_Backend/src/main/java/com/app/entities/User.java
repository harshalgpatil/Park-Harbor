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
public class User extends BaseEntity {

//	@Column(name = "id", unique = true, nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer Id;
	@Column(name = "f_name", length = 30, nullable = false)
	private String FirstName;
	@Column(name = "l_name", length = 30, nullable = false)
	private String LastName;
	@Column(name = "email_id", length = 50, nullable = false, unique = true)
	private String EmailID;
	@Column(name = "address", length = 100, nullable = false)
	private String Address;
	@Column(name = "phone_no", length = 10, nullable = false, unique = true)
	private Integer ContactNumber;
	@Column(name = "license_no", length = 30, nullable = false, unique = true)
	private String LicenseNumber;
	@Column(name = "dob", nullable = false)
	private LocalDate DateOfBirth;
	@Column(name = "password", length = 30, nullable = false, unique = true)
	private String Password;
	
//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<User> user = new ArrayList<>();
//	
//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Vehicle> vehicle = new ArrayList<>();

	
//	public void addUser(User u) {
//		user.add(u);
//		u.setUser(this);
//	}
//	public void removeUser(User u) {
//		user.remove(u);
//		u.setUser(null);
//	}
	

}
