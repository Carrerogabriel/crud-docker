package com.senac.crud_docker.repositories;

import com.senac.crud_docker.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    long countByClienteId(Long id);
}
