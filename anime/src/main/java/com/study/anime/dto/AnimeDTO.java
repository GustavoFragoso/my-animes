package com.study.anime.dto;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.List;

public record AnimeDTO(
        String titulo,
        List<String>genero,
        String sinopse,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") // Formato especificado
        LocalDate anoDeLancamento,
        byte[]image
) {
}
