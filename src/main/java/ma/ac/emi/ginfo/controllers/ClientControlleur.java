package ma.ac.emi.ginfo.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ac.emi.ginfo.models.ClientModel;
import ma.ac.emi.ginfo.repository.ClientRepository;
@CrossOrigin(origins = {"http://localhost:3000","http://localhost:8080" })
@RestController
@RequestMapping("/")
public class ClientControlleur {


		@Autowired
		private ClientRepository repository;	
		
		@GetMapping ("/Clients")
		public List<ClientModel> getAllClients(){
			return repository.findAll();
		}
		@PostMapping("/addClients")
		public ClientModel saveClient(@RequestBody ClientModel client) {
			return repository.save(client);
		}
		
		@DeleteMapping("/{id}")
		void deleteClient(@PathVariable(value= "id") Long ClientId) {
			repository.deleteById(ClientId);
		}

}
