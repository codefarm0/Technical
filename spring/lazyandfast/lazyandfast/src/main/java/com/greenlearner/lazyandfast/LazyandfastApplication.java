package com.greenlearner.lazyandfast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.*;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
public class LazyandfastApplication {

	public static void main(String[] args) {
		System.setProperty("spring.main.lazy-initialization", "true");
		SpringApplication.run(LazyandfastApplication.class, args);
	}

	@Bean
	RouterFunction<ServerResponse> routes(){
		return RouterFunctions.route(RequestPredicates.GET("/hi"), r -> ok().syncBody("helo babemmmmm"));
	}
}
