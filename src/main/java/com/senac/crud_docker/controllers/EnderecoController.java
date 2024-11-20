package br.backend.crud.controllers;

import br.backend.crud.dtos.endereco.EnderecoResponseDTO;
import br.backend.crud.models.Endereco;
import br.backend.crud.services.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
@RequiredArgsConstructor
public class EnderecoController {

    private final EnderecoService enderecoService;

    @PostMapping("/create")
    public ResponseEntity<EnderecoResponseDTO> create(@RequestBody Endereco endereco){
        return ResponseEntity.status(201).body(enderecoService.create(endereco));
    }
}
