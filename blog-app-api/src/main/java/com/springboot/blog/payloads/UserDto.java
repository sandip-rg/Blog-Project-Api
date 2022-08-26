package com.springboot.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 characters")
	private String name;
	
	@Email(regexp = ".+@.+\\..+", message = "Email address is not valid")
	private String email;
	
	@NotEmpty
	@Size(min = 4, max = 12, message = "password must be min of 4 chars and max of 12 chars !! ")
	private String password;
	
	@NotEmpty
	private String about;
}
