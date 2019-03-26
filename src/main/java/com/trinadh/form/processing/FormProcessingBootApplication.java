package com.trinadh.form.processing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.trinadh.configclss"})
public class FormProcessingBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormProcessingBootApplication.class, args);
	}

}

