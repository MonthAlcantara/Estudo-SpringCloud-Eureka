package io.github.monthalcantara.FahrenheitClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // Dessa forma o EurekaServer consegue descobrir essa aplicação como Client
public class FahrenheitClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FahrenheitClientApplication.class, args);
	}

}
