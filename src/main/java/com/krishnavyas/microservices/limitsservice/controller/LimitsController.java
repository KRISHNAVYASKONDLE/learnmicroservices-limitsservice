package com.krishnavyas.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishnavyas.microservices.limitsservice.bean.Limits;
import com.krishnavyas.microservices.limitsservice.configuration.LimitsConfiguration;

@RestController
public class LimitsController {
	
	@Autowired
	private LimitsConfiguration  limitsConfiguration; 
	
	public LimitsController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(limitsConfiguration.getMinimum(),limitsConfiguration.getMaximum());
	}

}
