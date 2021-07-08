package com.demo.device;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class DeviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DeviceApplication.class, args);
	}
}