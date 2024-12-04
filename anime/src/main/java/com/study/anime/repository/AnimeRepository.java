package com.study.anime.repository;

import com.study.anime.model.AnimeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<AnimeModel,Long>{

}
