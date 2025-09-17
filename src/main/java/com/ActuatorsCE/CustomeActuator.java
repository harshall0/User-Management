package com.ActuatorsCE;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Endpoint
public class CustomeActuator {
	
	@ReadOperation
	@GetMapping("/statuscheck")
	public String getstatus() {
		return "status is ok";
	}
	

}
