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
public class Payment extends BaseEntity {

//	@Column(name = "id", unique = true, nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer Id;
	@Column(name = "amount", nullable = false)
	private Integer Amount;
	@Column(name = "p_method", nullable = false)
	private PaymentMethod PName;
	@Column(name = "dot", nullable = false)
	private LocalDate DateOfTransaction;

//	@OneToOne
//	private Order order;
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
