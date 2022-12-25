package com.example.projectspringboot.services.exceptions;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msm){
        super(msm);
    }
}
