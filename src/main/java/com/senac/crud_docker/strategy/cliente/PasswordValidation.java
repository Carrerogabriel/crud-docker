package com.senac.crud_docker.strategy.cliente;

import com.senac.crud_docker.dtos.cliente.ClienteRequestDTO;
import com.senac.crud_docker.exception.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class PasswordValidation implements NewClienteStrategy {
    @Override
    public void validate(ClienteRequestDTO requestDTO) {
        if (requestDTO.password() == null || requestDTO.password().isBlank() || requestDTO.password().isEmpty()){
            throw new ValidationException("Informe sua senha");
        }
    }
}
