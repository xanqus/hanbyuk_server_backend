package com.example.hanbyuk_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.hanbyuk_server.properties.FileUploadProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileUploadProperties.class
})

public class Hanbyuk_serverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hanbyuk_serverApplication.class, args);
	}

}
