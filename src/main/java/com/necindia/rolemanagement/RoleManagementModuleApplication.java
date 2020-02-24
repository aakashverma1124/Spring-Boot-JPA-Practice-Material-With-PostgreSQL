package com.necindia.rolemanagement;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class RoleManagementModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleManagementModuleApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	@RequestMapping(value = "/")
	   public String hello() {
	      return "You're running on Tomcat Server!";
	   }

}
