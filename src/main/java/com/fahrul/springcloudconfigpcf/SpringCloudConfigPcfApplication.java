package com.fahrul.springcloudconfigpcf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class SpringCloudConfigPcfApplication {
	
	@Value("${name:not found}")
	private String name;
	
	@GetMapping("/")
	public String getMessage() {
		return "Welcome to all : " + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigPcfApplication.class, args);
	}

}
