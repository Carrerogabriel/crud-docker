package com.senac.crud_docker.exception;

public class TokenCreationException extends RuntimeException{

    public TokenCreationException(String message){
        super(message);
    }
}
