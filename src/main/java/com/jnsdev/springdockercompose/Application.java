package com.jnsdev.springdockercompose;

import com.jnsdev.springdockercompose.model.Product;
import com.jnsdev.springdockercompose.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Slf4j
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}
		@Bean
		CommandLineRunner commandLineRunner(ProductRepository repository) {
			return arg -> {
				List<Product> list = List.of(
						Product.builder().name("Macbook").quantity(10).build(),
						Product.builder().name("Frigidaire").quantity(2).build());

				repository.saveAll(list);
				log.info("Product list has been persisted {}", list);
			};
		}

}
