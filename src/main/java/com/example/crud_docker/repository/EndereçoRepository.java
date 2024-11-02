package com.example.crud_docker.repository;

import com.example.crud_docker.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndereçoRepository extends JpaRepository<Endereco, Long> {
}
