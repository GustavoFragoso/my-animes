package com.study.anime.service;

import com.study.anime.dto.AnimeDTO;
import com.study.anime.mapper.AnimeMapper;
import com.study.anime.model.AnimeModel;
import com.study.anime.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    @Autowired
    private AnimeRepository repository;
    public AnimeDTO createAnime (AnimeModel anime){
        repository.save(anime);
        return AnimeMapper.animeDTO(anime);

    }
    public List<AnimeDTO>listarAnimes(){
        List<AnimeModel>lista=repository.findAll(Sort.by(Sort.Direction.ASC,"titulo"));
        return lista.stream().map(AnimeMapper::animeDTO).toList();


    }


}
