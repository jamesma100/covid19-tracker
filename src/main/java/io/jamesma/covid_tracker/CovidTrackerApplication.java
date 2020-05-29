/**
 * Goto start.spring.io
 * Select Java, Maven project
 * Install dependencies: Spring Web, Thymeleaf (for front end)
 * -> Generate
 *
 *
 */
package io.jamesma.covid_tracker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidTrackerApplication.class, args);
	}

}
