package com.example.WebFlux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class WebFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxApplication.class, args);
		System.out.println("web flux");
		Flux<String> flux = Flux.just("A", "B", "C").log();
		//flux.subscribe(System.out::println);
	
		
	}

}
