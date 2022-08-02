package com.douglasdjf.valitationcustom.handlerException;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorApplicationException{

    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String messagem;
    private String path;
    private List<FieldError> campos;
}
