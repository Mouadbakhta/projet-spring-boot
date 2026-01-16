package net.bakhta.demo.exception;

import net.bakhta.demo.dto.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler(ClientNotFoundException.class)
    public ResponseEntity<ApiResponse<Void>> ClientNotFoundExceptionHandler(ClientNotFoundException e){
        var respons = new ApiResponse<Void>();
        respons.setMessage(e.getMessage());
        respons.setSuccess(false);
        return ResponseEntity.status(404).body(respons);
    }

}
