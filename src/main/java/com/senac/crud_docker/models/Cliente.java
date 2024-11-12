package com.senac.crud_docker.models;

import com.senac.crud_docker.enums.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Cliente extends EntityID implements UserDetails {
    private String nome;
    private String sobrenome;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @CreationTimestamp
    private LocalDate dataCadastro;
    private LocalDate dataNascimento;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    public Cliente(String nome,
                   String sobrenome,
                   String email,
                   String password,
                   Sexo sexo,
                   LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.password = password;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }
}
