package br.backend.crud.controllers;

import br.backend.crud.dtos.cliente.ClienteLoginDTO;
import br.backend.crud.dtos.cliente.ClienteRequestDTO;
import br.backend.crud.dtos.cliente.ClienteResponseDTO;
import br.backend.crud.dtos.token.TokenResponseDTO;
import br.backend.crud.services.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping("/register")
    public ResponseEntity<ClienteResponseDTO> register(@RequestBody ClienteRequestDTO requestDTO){
        return ResponseEntity.status(201).body(clienteService.create(requestDTO));
    }

    @PostMapping("/login")
    public ResponseEntity<TokenResponseDTO> login(@RequestBody ClienteLoginDTO loginDTO){
        return ResponseEntity.ok(clienteService.login(loginDTO));
    }
}
