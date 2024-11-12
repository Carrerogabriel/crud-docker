package com.senac.crud_docker.dtos.cliente;

import com.senac.crud_docker.models.Cliente;

public record ClienteResponseDTO(
        String nome,
        String sobrenome,
        String email
) {

    public static ClienteResponseDTO fromEntity(Cliente cliente){
        return new ClienteResponseDTO(
                cliente.getNome(),
                cliente.getSobrenome(),
                cliente.getEmail()
        );
    }
}
