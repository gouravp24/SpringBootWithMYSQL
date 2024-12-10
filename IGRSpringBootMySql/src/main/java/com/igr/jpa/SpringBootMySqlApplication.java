package com.igr.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMySqlApplication {

	public static void main(String[] args) {
		/* ApplicationContext context = */
		SpringApplication.run(SpringBootMySqlApplication.class, args);

//		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user = new User();
//		user.setName("gourav");
//		user.setCity("karad");
//		user.setStatus("Study at IGR");
//		User user1 = userRepository.save(user);

	}

}
