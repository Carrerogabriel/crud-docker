package com.senac.crud_docker.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@ToString
public class EntityID {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
