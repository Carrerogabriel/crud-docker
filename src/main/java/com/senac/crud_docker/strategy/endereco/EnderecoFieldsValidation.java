package com.senac.crud_docker.strategy.endereco;

import com.senac.crud_docker.dtos.endereco.EnderecoRequestDTO;
import com.senac.crud_docker.exception.ValidationException;
import com.senac.crud_docker.models.Endereco;
import com.senac.crud_docker.strategy.NewEnderecoStrategy;
import org.springframework.stereotype.Component;

@Component
public class EnderecoFieldsValidation implements NewEnderecoStrategy {

    @Override
    public void validate(EnderecoRequestDTO requestDTO) {
        Endereco endereco = EnderecoRequestDTO.EnderecofromEntity(requestDTO);

        if (endereco.getRua() == null || endereco.getRua().isEmpty() || endereco.getRua().isBlank()){
            throw new ValidationException("A Rua deve ser informada");
        }

        if (endereco.getBairro() == null || endereco.getBairro().isEmpty() || endereco.getBairro().isBlank()){
            throw new ValidationException("O Bairro deve ser informado");
        }

        if (endereco.getCidade() == null || endereco.getCidade().isEmpty() || endereco.getCidade().isBlank()){
            throw new ValidationException("A Cidade deve ser informada");
        }

        if (endereco.getUf() == null || endereco.getUf().isEmpty() || endereco.getUf().isBlank()){
            throw new ValidationException("O Estado deve ser informado");
        }
    }
}
