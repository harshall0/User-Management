package com.ServiceIMPL;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.DTO.UserRequestDTO;
import com.Entity.User;
import com.Enum.UserStatus;
import com.Service.HomeService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HomeServiceIMPL implements HomeService {

	@Override
	public void saveuser(UserRequestDTO userRequestDTO) {
	log.info("service layer"  + userRequestDTO);
	User us = new User();
	us.setUname(userRequestDTO.getUname());
	us.setAge(userRequestDTO.getAge());
	us.setPassword(userRequestDTO.getPassword());
	us.setUaddress(userRequestDTO.getUaddress());
	
	us.setUsersw(UserStatus.Active);
	us.setCreationDate(LocalDateTime.now());
	
	log.info("hogyaaaaaaaa" + us);
	
		
	}

}
