package br.com.random.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.github.cloudyrock.spring.v5.EnableMongock;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "br.com.random.school.persistence.mongo")
@EnableMongock
public class RandomSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomSchoolApplication.class, args);
	}

}
