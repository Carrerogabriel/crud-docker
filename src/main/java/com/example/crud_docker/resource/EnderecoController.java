package com.example.crud_docker.resource;

import com.example.crud_docker.model.Endereco;

import com.example.crud_docker.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

public class EnderecoController {


    @Autowired
    private EnderecoService enderecoService;

    @PostMapping()
    public ResponseEntity salvar(@RequestBody Endereco endereco){
        Endereco save = enderecoService.salvar(endereco);
        return ResponseEntity.created(URI.create("/endereco/salvar" + endereco.getId())).body(save);
    }

    @GetMapping
    public  ResponseEntity buscarTodos(){
        List<Endereco> endereco = enderecoService.buscarTodos();
        return ResponseEntity.ok(endereco);
    }

    @DeleteMapping("{id}")
    public  ResponseEntity remover(@PathVariable("id") Long id){
        enderecoService.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public  ResponseEntity alterar(@PathVariable("id") Long id, @RequestBody Endereco entity){
        Endereco alterado = enderecoService.alterar(id, entity);
        return  ResponseEntity.ok().body(alterado);
    }

}