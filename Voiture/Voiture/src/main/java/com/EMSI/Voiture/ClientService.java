package com.EMSI.Voiture;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.EMSI.Voiture.model.Client;
	

@FeignClient(name="SERVICE-CLIENT")
public interface ClientService {

	 @GetMapping("/client/{id}") // Make sure the path matches the service-client's API
	    Client chercherUnClients(@PathVariable Long id);
}
