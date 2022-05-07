package br.com.phdigitalcode.nammingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NammingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NammingServerApplication.class, args);
	}

}
