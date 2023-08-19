package com.anamika.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.anamika.producer.Performer;

@SpringBootApplication(scanBasePackages = "com.anamika.producer")
public class MyperformanceSpringbootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer=SpringApplication.run(MyperformanceSpringbootProjectApplication.class, args);
	    Performer performer1=(Performer)springContainer.getBean("dancer");
	    performer1.perform();
	    
	    Performer performer2=(Performer)springContainer.getBean("singer");
	    performer2.perform();
	    
	    Performer performer3=(Performer)springContainer.getBean("juggler");
	    performer3.perform();
	}

}
