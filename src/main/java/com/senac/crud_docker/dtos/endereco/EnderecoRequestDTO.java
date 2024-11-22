package com.senac.crud_docker.dtos.endereco;

import com.senac.crud_docker.models.Cliente;
import com.senac.crud_docker.models.Endereco;

public record EnderecoRequestDTO(
    String rua,
    String bairro,
    String cidade,
    String uf,
    Cliente cliente
) {
    public static Endereco EnderecofromEntity(EnderecoRequestDTO requestDTO){
        return new Endereco(
                requestDTO.rua(),
                requestDTO.bairro(),
                requestDTO.cidade(),
                requestDTO.uf(),
                requestDTO.cliente()
        );
    }
}