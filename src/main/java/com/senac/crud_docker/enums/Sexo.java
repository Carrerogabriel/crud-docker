package com.senac.crud_docker.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Sexo {
    MASCULINO,
    FEMININO,
    NAO_INFORMADO;

    @JsonCreator
    public static Sexo fromString(String sexo) {
        if (sexo.isEmpty() || sexo.isBlank()) {
            return NAO_INFORMADO;
        }
        return Sexo.valueOf(sexo.toUpperCase());
    }

    @JsonValue
    public String toValue() {
        return this.name();
    }
}