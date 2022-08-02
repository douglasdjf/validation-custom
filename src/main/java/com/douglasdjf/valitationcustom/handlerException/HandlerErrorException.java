package com.douglasdjf.valitationcustom.handlerException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class HandlerErrorException  {


    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<ErrorApplicationException> validation(MethodArgumentNotValidException ex){

       List<FieldError> fieldErrors = ex.getBindingResult()
                                        .getFieldErrors()
                                        .stream()
                                        .map(error -> FieldError
                                                        .builder()
                                                            .field(error.getField())
                                                            .message(error.getDefaultMessage())
                                                        .build()
                                        ).collect(Collectors.toList());


       ErrorApplicationException errorApplicationException = ErrorApplicationException.builder()
                                                                    .error("Erro validaçao campos")
                                                                   .messagem("Campos inválidos")
                                                                   .status(HttpStatus.BAD_REQUEST.value())
                                                                   .campos(fieldErrors)
                                                                   .timestamp(LocalDateTime.now())
                                                                .build();


       return ResponseEntity.ok(errorApplicationException);

    }
}
