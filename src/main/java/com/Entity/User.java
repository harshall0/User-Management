package com.Entity;

import java.time.LocalDateTime;

import com.Enum.UserStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
	private int uid;
	
	private String uname;
	
	private String uaddress;
	
	private String password;
	
	private int age;
	
	private UserStatus usersw;

	private LocalDateTime creationDate;
	
}
