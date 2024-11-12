package com.senac.crud_docker.service;

import com.senac.crud_docker.dtos.endereco.EnderecoResponseDTO;
import com.senac.crud_docker.models.Endereco;
import com.senac.crud_docker.repositories.EnderecoRepository;
import com.senac.crud_docker.strategy.NewEnderecoStrategy;
import com.senac.crud_docker.utils.AuthenticationUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnderecoService {


    private final EnderecoRepository enderecoRepository;
    private final List<NewEnderecoStrategy> newEnderecoStrategies;

    public EnderecoResponseDTO create(Endereco endereco){

        newEnderecoStrategies.forEach(check -> check.validate(endereco));

        endereco.setCliente(AuthenticationUtil.retriveAuthenticatedUser());

        return EnderecoResponseDTO.fromEntity(enderecoRepository.save(endereco));
    }

}


