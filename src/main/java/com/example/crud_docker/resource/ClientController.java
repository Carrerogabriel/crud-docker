package com.example.crud_docker.resource;

import com.example.crud_docker.model.Cliente;
import com.example.crud_docker.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping()
    public ResponseEntity salvar(@RequestBody Cliente client){
        Cliente save = clientService.salvar(client);
        return ResponseEntity.created(URI.create("/quadra/salvar" + client.getId())).body(save);
    }

    @GetMapping
    public  ResponseEntity buscarTodos(){
        List<Cliente> clients = clientService.buscarTodos();
        return ResponseEntity.ok(clients);
    }

    @DeleteMapping("{id}")
    public  ResponseEntity remover(@PathVariable("id") Long id){
        clientService.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public  ResponseEntity alterar(@PathVariable("id") Long id, @RequestBody Cliente entity){
        Cliente alterado = clientService.alterar(id, entity);
        return  ResponseEntity.ok().body(alterado);
    }

}
