package br.backend.crud.dtos.token;

public record TokenResponseDTO(
        String token,
        int expiresInMinutes
) {
}
