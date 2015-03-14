package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.model.Animal;
import com.model.Calculator;
import com.model.Collar;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com")
public class SpringConfig {
	@Bean
	public Animal animal() {
		return new Animal(5, "jim", collar());
	}

	@Bean
	public Collar collar() {
		return new Collar(2);
	}

	@Bean
	public Calculator calculator() {
		return new Calculator();
	}

}
