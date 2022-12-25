package org.sid.inventoryservice;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args -> {
			productRepository.save(new Product(null,"PC",5000,30));
			productRepository.save(new Product(null,"Ordinateur",788,12));
			productRepository.save(new Product(null,"Souris",400,4));
			productRepository.save(new Product(null,"Ecran",1000,10));
			productRepository.save(new Product(null,"Cable",20,15));
			productRepository.save(new Product(null,"Micro",150,20));
			productRepository.save(new Product(null,"Imprimante",1000,6));
			productRepository.save(new Product(null,"Smartphone",3000,20));
		};
	}
}