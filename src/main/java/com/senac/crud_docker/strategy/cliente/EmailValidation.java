package com.senac.crud_docker.strategy.cliente;

import com.senac.crud_docker.dtos.cliente.ClienteRequestDTO;
import com.senac.crud_docker.exception.ValidationException;
import com.senac.crud_docker.repositories.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailValidation implements NewClienteStrategy {

    private final ClienteRepository clienteRepository;

    @Override
    public void validate(ClienteRequestDTO requestDTO) {
        if (clienteRepository.existsByEmail(requestDTO.email())){
            throw new ValidationException("Email já cadastrado na base de dados");
        }

        if (requestDTO.email() == null || requestDTO.email().isBlank() || requestDTO.email().isEmpty()){
            throw new ValidationException("Preencha seu email!");
        }
    }
}
