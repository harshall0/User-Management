package com.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserRequestDTO {
	private String uname;
	
	private String uaddress;
	
	private String password;
	
	private int age;
}
