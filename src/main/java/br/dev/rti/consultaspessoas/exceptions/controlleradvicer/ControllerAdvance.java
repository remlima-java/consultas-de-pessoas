package br.dev.rti.consultaspessoas.exceptions.controlleradvicer;

import br.dev.rti.consultaspessoas.exceptions.UsarNotFindException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerAdvance {

    @ExceptionHandler(UsarNotFindException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Error> handlerMessageNotFoundException(UsarNotFindException exception) {
        Error error = Error.builder()
                .message(exception.getMessage())
                .status(HttpStatus.NOT_FOUND)
                .timestamp(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }


}
