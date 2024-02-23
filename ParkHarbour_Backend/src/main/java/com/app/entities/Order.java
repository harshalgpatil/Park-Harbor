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
public class Order extends BaseEntity {

//	@Column(name = "id", unique = true, nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer Id;
	@Column(name = "charges", nullable = false)
	private Integer Charges;
	@Column(name = "p_address", length = 100, nullable = false)
	private String PAddress;
	@Column(name = "duration", nullable = false)
	private LocalTime Duration;
	
//	@ManyToMany
//	private Provider provider;
//	
//	@ManyToMany
//	private User user;
//	
////	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
////	private List<User> user = new ArrayList<>();
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
