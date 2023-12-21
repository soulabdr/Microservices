package com.EMSI.Voiture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.EMSI.Voiture.model.Client;
import com.EMSI.Voiture.model.voiture;
import com.EMSI.Voiture.repository.VoitureRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class VoitureApplication {
	
    @Autowired
    private ClientService clientService;
    
	@Bean
	CommandLineRunner initialiserBaseH2(VoitureRepository voitureRepository){
		
		return args -> {
			
		       Client c1 = clientService.chercherUnClients(2L);
		       Client c2 = clientService.chercherUnClients(1L);
		       System.out.println("**************************");
		       System.out.println("Id est :" + c2.getId());
		       System.out.println("Nom est :" + c2.getNom());
		       System.out.println("Nom est :" + c1.getAge());
		       System.out.println("**************************");
		       System.out.println("**************************");
		       System.out.println("Id est :" + c1.getId());
		       System.out.println("Nom est :" + c1.getNom());
		       System.out.println("Nom est :" + c1.getAge());
		       System.out.println("**************************");
		       voitureRepository.save(new voiture(Long.parseLong("1"), "Toyota", "A 25 333", "Corolla", c2.getNom()));
		       voitureRepository.save(new voiture(Long.parseLong("2"), "Renault", "B 6 3456", "Megane", c1.getNom()));
//		       voitureRepository.save(new voiture(Long.parseLong("3"), "Peugeot", "A 55 4444", "301", c1));
		    };

		
	}
	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}

}
