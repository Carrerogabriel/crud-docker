package com.senac.crud_docker.strategy;

import com.senac.crud_docker.dtos.endereco.EnderecoRequestDTO;
import com.senac.crud_docker.models.Endereco;

public interface NewEnderecoStrategy {

    void validate(EnderecoRequestDTO requestDTO);
}
