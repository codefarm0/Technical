package com.gl.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.microservices.limitsservice.Configuration;
import com.gl.microservices.limitsservice.dto.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration getConfiguration() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
		
	}

}
