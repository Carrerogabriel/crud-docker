package com.senac.crud_docker.utils;

import com.senac.crud_docker.models.Cliente;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthenticationUtil {

    private AuthenticationUtil(){
        throw new IllegalStateException("Utility Class");
    }

    public static Cliente retriveAuthenticatedUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return (Cliente) authentication.getPrincipal();
    }
}
