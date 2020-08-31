package com.fengfan.k12;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fengfan.k12.dao")
public class K12Application {

	public static void main(String[] args) {
		SpringApplication.run(K12Application.class, args);
	}

}
