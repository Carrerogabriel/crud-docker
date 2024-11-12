package com.senac.crud_docker.exception;

public class ValidationException extends RuntimeException{

    public ValidationException(String message){
        super(message);
    }
}
