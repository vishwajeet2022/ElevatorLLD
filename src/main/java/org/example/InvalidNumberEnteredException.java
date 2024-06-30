package org.example;

public class InvalidNumberEnteredException extends RuntimeException{
    InvalidNumberEnteredException(String message){
        super(message);
    }
}
