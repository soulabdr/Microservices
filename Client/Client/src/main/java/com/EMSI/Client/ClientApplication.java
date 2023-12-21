package com.EMSI.Client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.EMSI.Client.Model.Client;
import com.EMSI.Client.Repository.ClientRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {
	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
	    return args -> {
	       clientRepository.save(new Client(Long.parseLong("4"), "Boulhdir Soulaimane", Integer.parseInt("23")));
	       clientRepository.save(new Client(Long.parseLong("5"), "Boulhdir Balssam", Integer.parseInt("23")));

	    };
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
