package com.zipcodewilmington.bakery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@Configuration + @EnableAutoConfigraution + @ComponenetScan
@SpringBootApplication
public class BakeryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BakeryApplication.class, args);
	}
}