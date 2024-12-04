package com.study.anime.mapper;

import com.study.anime.dto.AnimeDTO;
import com.study.anime.model.AnimeModel;

public class AnimeMapper {

    public static AnimeDTO animeDTO(AnimeModel model){
        return new AnimeDTO(
                model.getTitulo(),
                model.getGenero(),
                model.getSinopse(),
                model.getAnoDeLancamento(),
                model.getImagem()
        );
    }
}
