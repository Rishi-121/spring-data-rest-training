package com.example;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDataRestDemoApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestDemoApplication.class, args);
	}

	@Override
	public void run(String... args) {

		User user1 = User.builder()
				.firstName("John")
				.lastName("Doe")
				.email("john.doe@example.com")
				.build();

		User user2 = User.builder()
				.firstName("Maria")
				.lastName("Jones")
				.email("maria.jones@example.com")
				.build();

		User user3 = User.builder()
				.firstName("Ken")
				.lastName("Miles")
				.email("ken.miles@example.com")
				.build();

		this.userRepository.saveAll(List.of(user1, user2, user3));
	}
}
