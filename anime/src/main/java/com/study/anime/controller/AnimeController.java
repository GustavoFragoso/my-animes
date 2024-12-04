package com.study.anime.controller;

import com.study.anime.dto.AnimeDTO;
import com.study.anime.model.AnimeModel;
import com.study.anime.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animes")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    // Endpoint para criar um novo anime
    @PostMapping("/create")
    public ResponseEntity<AnimeDTO> createAnime(@RequestBody AnimeModel animeModel) {
        AnimeDTO createdAnime = animeService.createAnime(animeModel);
        return new ResponseEntity<>(createdAnime, HttpStatus.CREATED);
    }

    // Endpoint para listar todos os animes ordenados pelo título
    @GetMapping
    public ResponseEntity<List<AnimeDTO>> listAnimes() {
        List<AnimeDTO> animes = animeService.listarAnimes();
        return ResponseEntity.ok(animes);
    }
}
