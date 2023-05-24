package com.culturehub;

import com.culturehub.entities.Blog;
import com.culturehub.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private BlogRepository blogRepository;

//	@Bean
//	CommandLineRunner commandLineRunner(){
//		return args -> {
//			blogRepository.save(Blog.builder().author("Nguyen Van A").build());
//
//		};
//	}
}
