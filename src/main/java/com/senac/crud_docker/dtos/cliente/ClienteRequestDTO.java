package com.senac.crud_docker.dtos.cliente;

import com.senac.crud_docker.enums.Sexo;
import com.senac.crud_docker.models.Cliente;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.time.LocalDate;

public record ClienteRequestDTO(
        String nome,
        String sobrenome,
        String email,
        String password,
        Sexo sexo,
        LocalDate dataNascimento
) {

    public static Cliente clienteFromEntity(ClienteRequestDTO requestDTO){
        return new Cliente(
                requestDTO.nome(),
                requestDTO.sobrenome(),
                requestDTO.email(),
                new BCryptPasswordEncoder().encode(requestDTO.password()),
                requestDTO.sexo() == null ? Sexo.NAO_INFORMADO : requestDTO.sexo(),
                requestDTO.dataNascimento
        );
    }
}
