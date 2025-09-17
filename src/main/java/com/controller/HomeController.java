package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.UserRequestDTO;
import com.Service.HomeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user/v1")
@Slf4j
public class HomeController {
	
	@Autowired
	private HomeService hs;
	
	
	
	@PostMapping("/register")
	public void registeruser(@RequestBody UserRequestDTO userRequestDTO){
		
		log.info("DTO" + userRequestDTO);
		hs.saveuser(userRequestDTO);
	}
}