package com.game.team1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class Team1Application {

	public static void main(String[] args) {
		SpringApplication.run(Team1Application.class, args);
	}

}
