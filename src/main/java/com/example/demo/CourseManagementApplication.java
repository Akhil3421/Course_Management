package com.example.demo;

import com.example.demo.model.Users;
import com.example.demo.repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseManagementApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepo userRepository) {
		return (args) -> {
			// Insert an initial user if no users exist
			if (userRepository.count() == 0) {
				Users adminUser = new Users();
				adminUser.setUsername("admin");
				adminUser.setPassword("$2a$12$8GhKYdZ0iVjgF6tr46H3le0win5K/np.bRBJ8HpaDTb0JUWd5slfG"); // password is "adminPassword"
				adminUser.setEmail("admin@example.com");
				adminUser.setRole(Users.Role.ADMIN);

				userRepository.save(adminUser);
			}
		};
	}
}
