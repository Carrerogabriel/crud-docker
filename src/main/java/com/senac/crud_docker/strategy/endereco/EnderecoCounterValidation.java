package com.senac.crud_docker.strategy.endereco;

import com.senac.crud_docker.exception.ValidationException;
import com.senac.crud_docker.models.Endereco;
import com.senac.crud_docker.repositories.EnderecoRepository;
import com.senac.crud_docker.strategy.NewEnderecoStrategy;
import com.senac.crud_docker.utils.AuthenticationUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnderecoCounterValidation implements NewEnderecoStrategy {

    private final EnderecoRepository enderecoRepository;

    @Override
    public void validate(Endereco endereco) {
        if (enderecoRepository.countByClienteId(AuthenticationUtil.retriveAuthenticatedUser().getId()) >= 5){
            throw new ValidationException("Você ja tem 5 endereços cadastrados");
        }
    }
}
