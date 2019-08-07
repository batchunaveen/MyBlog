package com.naveen.projects.myblog;

import com.naveen.projects.myblog.domain.Card;
import com.naveen.projects.myblog.domain.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CardsApplication implements CommandLineRunner {

	@Autowired
	private CardsRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Card("1",2,"What is spring mvc", "Spring mvc is ...",false));
		repository.save(new Card("2",3,"What is spring aop", "Spring aop is ...",false));


		// fetch all customers
		System.out.println("Cards found with findAll():");
		System.out.println("-------------------------------");
		for (Card card : repository.findAll()) {
			System.out.println(card._id);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Cards found with findById('1'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findById("1"));

		System.out.println("Card found with findByAll:");
		System.out.println("--------------------------------");
		for (Card card : repository.findAll()) {
			System.out.println(card._id);
		}

	}
}
