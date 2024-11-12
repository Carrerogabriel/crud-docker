package com.senac.crud_docker.dtos.endereco;

import com.senac.crud_docker.models.Endereco;

public record EnderecoResponseDTO(
        String rua,
        String bairro,
        String cidade,
        String uf
) {

    public static EnderecoResponseDTO fromEntity(Endereco endereco){
        return new EnderecoResponseDTO(
                endereco.getRua(),
                endereco.getBairro(),
                endereco.getCidade(),
                endereco.getUf()
        );
    }
}
