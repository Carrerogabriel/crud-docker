package com.senac.crud_docker.controllers;

import com.senac.crud_docker.dtos.endereco.EnderecoResponseDTO;
import com.senac.crud_docker.models.Endereco;
import com.senac.crud_docker.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/enderecos")
@RequiredArgsConstructor
public class EnderecoController {

    private final EnderecoService enderecoService;

    public ResponseEntity<EnderecoResponseDTO> create(@RequestBody Endereco endereco){
        return ResponseEntity.status(201).body(enderecoService.create(endereco));
    @PostMapping
    }
}
