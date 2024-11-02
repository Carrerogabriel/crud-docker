package com.example.crud_docker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;


@Entity
@Getter
@Setter
public class Endereco {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String rua;

    @Column
    private String cidade;

    @Column
    private String estado;

    @Column
    private Cliente cliente;

    @Column
    private LocalDateTime dataCadastro;

}
