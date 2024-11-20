package com.senac.crud_docker.strategy.cliente;

import com.senac.crud_docker.dtos.cliente.ClienteRequestDTO;
import com.senac.crud_docker.exception.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class NomeSobrenomeValidation implements NewClienteStrategy {

    @Override
    public void validate(ClienteRequestDTO requestDTO) {
        if (requestDTO.nome() == null || requestDTO.nome().isEmpty() || requestDTO.nome().isBlank()){
            throw new ValidationException("Nome não informado!");
        }

        if (requestDTO.sobrenome() == null || requestDTO.sobrenome().isEmpty() || requestDTO.sobrenome().isBlank()){
            throw new ValidationException("Sobrnome não informads!");
        }
    }
}
