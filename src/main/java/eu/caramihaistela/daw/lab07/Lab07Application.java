package eu.caramihaistela.daw.lab07;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import eu.caramihaistela.daw.lab07.domain.*;

@SpringBootApplication
public class Lab07Application {

	private static final Logger logger = LoggerFactory.getLogger(Lab07Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Lab07Application.class, args);
		logger.info("Hello Spring Boot");
	}

	@Bean
	CommandLineRunner runner(CarRepository crepository, OwnerRepository orepository) {
		return args -> {
			Owner owner1 = new Owner("John", "Johnson");
			Owner owner2 = new Owner("Mary", "Robinson");
			orepository.save(owner1);
			orepository.save(owner2);
			crepository.save(new Car(owner1, "Ford", "Mustang", "Red", "ADF -1121", 2017, 59000));
			crepository.save(new Car(owner2, "Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000));
			crepository.save(new Car(owner2, "Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000));
		};
	}

}
