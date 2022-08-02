package com.douglasdjf.valitationcustom.handlerException;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class FieldError {

    private String field;
    private String message;
}
