package com.senac.crud_docker.service;

import com.senac.crud_docker.dtos.cliente.ClienteResponseDTO;
import com.senac.crud_docker.models.Cliente;
import com.senac.crud_docker.repositories.ClienteRepository;
import com.senac.crud_docker.strategy.NewClienteStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ClienteService {


    private final ClienteRepository clienteRepository;
    private final List<NewClienteStrategy> newClienteStrategies;
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

    public ClienteResponseDTO create(ClienteResponseDTO request){

        newClienteStrategies.forEach(check -> check.validate(request));

        Cliente cliente = clienteRepository.save(ClienteResponseDTO.clienteFromEntity(request));

        return ClienteResponseDTO.fromEntity(cliente);
    }

    public TokenResponseDTO login(ClienteResponseDTO login){
        var usernamePassword = new UsernamePasswordAuthenticationToken(login.email(), login.password());
        var auth = authenticationManager.authenticate(usernamePassword);
        return new TokenResponseDTO(tokenService.generateToken((Cliente) auth.getPrincipal()), 2);
    }
}
