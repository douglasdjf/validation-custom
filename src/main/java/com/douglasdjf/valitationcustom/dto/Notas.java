package com.douglasdjf.valitationcustom.dto;

import com.douglasdjf.valitationcustom.valitation.NotEmptyList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Notas {

    @NotEmptyList(message = "Tom não pode ser vazio")
    private List<String> tom;

}
