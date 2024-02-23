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
public class ParkingAddress extends BaseEntity {

//	@Column(name = "id", unique = true, nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer Id;
	@Column(name = "pp_address", length = 100, nullable = false)
	private String PPAddress;
	@Column(name = "image_url", length = 150, nullable = false)
	private String ImageURL;
	@Column()
	
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
