package com.douglasdjf.valitationcustom.resource;

import com.douglasdjf.valitationcustom.dto.Notas;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("notas")
public class NotasResource {

    @PostMapping
    public ResponseEntity<?> criarNota(@Valid @RequestBody Notas notasDTO){
        return  ResponseEntity.ok(notasDTO);
    }
}
