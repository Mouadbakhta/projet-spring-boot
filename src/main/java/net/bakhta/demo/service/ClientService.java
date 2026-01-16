package net.bakhta.demo.service;

import net.bakhta.demo.entity.Client;
import net.bakhta.demo.exception.ClientNotFoundException;
import net.bakhta.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public List<Client> findAll(){
        return this.clientRepository.findAll();
    }

    public Client createClient(Client client) {
        return this.clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        this.clientRepository.deleteById(id);
    }

    public Client findClientById(Long id) {
        return this.clientRepository.findById(id).orElseThrow(()->new ClientNotFoundException("Client not found"));
    }
}
