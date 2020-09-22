package com.javafish.scrabble;

import javax.annotation.security.RolesAllowed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrabbleWebContentApplication {

	@RolesAllowed("*")
    public static void main(String[] args) {
        SpringApplication.run(ScrabbleWebContentApplication.class, args);
    }

}
