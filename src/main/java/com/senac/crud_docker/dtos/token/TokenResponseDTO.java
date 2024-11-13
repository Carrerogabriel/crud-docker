package com.senac.crud_docker.dtos.token;

public record TokenResponseDTO(
        String token,
        int expiresInMinutes
) {
}
