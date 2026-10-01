package com.example.demo.exception;

import com.example.demo.dto.erro.ErrorResponseDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.OffsetDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponseDTO> validationError(
            MethodArgumentNotValidException exception,
            HttpServletRequest request
    ) {

        // Pega o primeiro erro encontrado
        FieldError fieldError =
                exception.getBindingResult().getFieldErrors().get(0);

        // Dados do erro
        String codigo = "VALIDACAO_INVALIDA";
        String message = fieldError.getDefaultMessage();

        // Monta a resposta
        ErrorResponseDTO resposta = new ErrorResponseDTO(
                OffsetDateTime.now(),
                HttpStatus.UNPROCESSABLE_ENTITY.value(),
                HttpStatus.UNPROCESSABLE_ENTITY.getReasonPhrase(),
                codigo,
                message,
                request.getRequestURI()
        );

        return ResponseEntity
                .status(HttpStatus.UNPROCESSABLE_ENTITY)
                .body(resposta);
    }
}