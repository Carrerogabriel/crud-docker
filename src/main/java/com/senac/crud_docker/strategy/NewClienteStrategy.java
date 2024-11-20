package com.senac.crud_docker.strategy;

import com.senac.crud_docker.dtos.cliente.ClienteRequestDTO;

public interface NewClienteStrategy {
    void validate(ClienteRequestDTO requestDTO);
}
