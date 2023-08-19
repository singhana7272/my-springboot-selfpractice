package com.anamika.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anamika.producer.Greet;

@SpringBootApplication(scanBasePackages = "com.anamika.producer")
public class GreetSpringbootProjectTwoApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier("goodEvening")
	private Greet greet;
	

	public static void main(String[] args) {
		SpringApplication.run(GreetSpringbootProjectTwoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		greet.wish();
	}

}
