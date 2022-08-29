package com.cisco.demojwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemojwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojwtApplication.class, args);
	}

}
