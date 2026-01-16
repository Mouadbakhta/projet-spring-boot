package net.bakhta.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;


public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(String  message) {
        super(message);
    }
}
