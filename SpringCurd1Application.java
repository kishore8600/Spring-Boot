package com.example.springCURD1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.example.springCURD1.Repositery")  // Ensure this points to the correct package
public class SpringCurd1Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringCurd1Application.class, args);
	}
}

/*
Summary of the Flow:
->Client sends JSON input to the /saveOrUpdate endpoint.
->Controller maps the input to a CustomerDTO and forwards it to the Service Layer.
->Service Layer converts CustomerDTO to Customer entity and calls the Repository.
->Repository interacts with the Database to save/update the record.
->Database performs the SQL operation and returns the saved entity.
->Repository returns the saved entity to the Service Layer.
->Service Layer returns a success message to the Controller.
->Controller sends the success message to the Client.
*/

