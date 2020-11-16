package io.github.monthalcantara.ConverClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConverClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConverClientApplication.class, args);
	}

}
