package com.example.Dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication {

	public static void main(String[] args)  throws Exception {
		SpringApplication.run(DependencyApplication.class, args);


		Car car=new Car();
		ObjectCreator.injection(car);
		car.drive();
	}

}
