package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {
	
	private String FirstName;
	
	private String LastName;

	private String EmailID;
	
	private String Address;

	private Integer ContactNumber;

	private String LicenseNumber;

	private LocalDate DateOfBirth;

	private String Password;
		
}
