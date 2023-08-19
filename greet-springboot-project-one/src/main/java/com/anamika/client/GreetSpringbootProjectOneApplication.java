package com.anamika.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.anamika.producer.GoodMorning;
import com.anamika.producer.Greet;

@SpringBootApplication(scanBasePackages = "com.anamika.producer")
public class GreetSpringbootProjectOneApplication {
	
	@Bean
	public GoodMorning getGoodMorning() {
		return new GoodMorning("Anamika");
	}

	public static void main(String[] args) {
		ApplicationContext springContainer=SpringApplication.run(GreetSpringbootProjectOneApplication.class, args);
		Greet greet1=(Greet)springContainer.getBean("goodEvening");
		greet1.wish();
		
		Greet greet2=(Greet)springContainer.getBean("getGoodMorning");
		greet2.wish();
		
	
	}

}
