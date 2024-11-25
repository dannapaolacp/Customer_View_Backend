package com.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Excepción personalizada que devuelve un error 400 (Bad Request) cuando se valida un cliente incorrectamente.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class validationsClient extends RuntimeException {

    /**
     * Constructor que recibe un mensaje de error.
     *
     * @param message El mensaje de error.
     */
    public validationsClient(String message) {
        super(message); // Llama al constructor de RuntimeException con el mensaje.
    }
}
