package net.bakhta.demo.controller;

import net.bakhta.demo.dto.ApiResponse;
import net.bakhta.demo.entity.Client;
import net.bakhta.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public ResponseEntity<ApiResponse<List<Client>>> findAllClients(){
        var respons = new ApiResponse<List<Client>>();
        respons.setMessage("Clients retrieved successfully");
        respons.setSuccess(true);
        respons.setData(clientService.findAll());
        return ResponseEntity.ok(respons);
    }
    @PostMapping("/clients")
    public ResponseEntity<ApiResponse<Client>> createClient(@RequestBody  Client client){
        var respons = new ApiResponse<Client>();
        respons.setMessage("Cleint Created seccessfully");
        respons.setSuccess(true);
        respons.setData(clientService.createClient(client));
        return ResponseEntity.ok(respons);
    }
    @DeleteMapping("/clients/{id}")
    public ResponseEntity<ApiResponse<String>>  deleteClient(@PathVariable Long id){
        var respons = new ApiResponse<String>();
        respons.setMessage("Cleint deleted seccessfully");
        respons.setSuccess(true);
        return ResponseEntity.ok(respons);
    }
    @GetMapping("/clients/{id}")
    public ResponseEntity<ApiResponse<Client>> findByOne(@PathVariable Long id){
        var respons = new ApiResponse<Client>();
        respons.setMessage("Cleint find it seccessfully");
        respons.setSuccess(true);
        respons.setData(clientService.findClientById(id));
        return ResponseEntity.ok(respons);
    }


}
