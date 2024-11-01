package com.example.crud_docker.repository;

import com.example.crud_docker.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long> {


}
