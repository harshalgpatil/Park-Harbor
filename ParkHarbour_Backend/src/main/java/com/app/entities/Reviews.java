package com.app.entities;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.*;

@MappedSuperclass
@Entity
@Table(name = "userTable")
@Getter
@Setter
@ToString
public class Reviews extends BaseEntity {

//	@Column(name = "id", unique = true, nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer Id;
	@Column(name = "user_name", length = 30, nullable = false)
	private String UserName;
	@Column(name = "comment", length = 100, nullable = false)
	private String Comment;
	@Column(name = "date", nullable = false)
	private LocalDate Date;
	@Column(name = "rating", nullable = false)
	@Range(min = 1, max = 10)
	private Integer rating;
	
//	@ManyToOne
//	private User user;
//	
//
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
