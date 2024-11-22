package com.senac.crud_docker.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Endereco extends EntityID {
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;

    @CreationTimestamp
    private LocalDate dataCadastro;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    public Endereco(String rua,
                    String bairro,
                    String cidade,
                    String uf,
                    Cliente cliente) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cliente = cliente;
    }
}
