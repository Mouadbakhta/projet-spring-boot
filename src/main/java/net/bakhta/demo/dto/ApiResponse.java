package net.bakhta.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ApiResponse<T> {
    private Boolean success;
    private Instant temp = Instant.now();
    private String message;
    private T data;


}
