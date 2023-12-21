package com.EMSI.Client.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.EMSI.Client.Model.Client;
import com.EMSI.Client.Repository.ClientRepository;

@RestController
public class ClientController {

	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/clients")
	private List<Client> chercherClients(){
		
		return clientRepository.findAll();		
	}
	
	@GetMapping("/client/{id}")
    public Client chercherUnClients (@PathVariable Long id) throws Exception{

        return this.clientRepository.findById(id).orElseThrow(()-> new Exception("Client inexistnt"));
        
	}

}
