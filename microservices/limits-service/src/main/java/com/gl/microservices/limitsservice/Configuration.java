package com.gl.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	
	private int minimum;
	private int maximum;
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		System.out.println("picked maximum");
		return maximum;
	}
	public void setMaximum(int maximum) {
		System.out.println("set maximum");
		this.maximum = maximum;
	}
	

}
