package com.study.anime.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "animes")
@AllArgsConstructor
@NoArgsConstructor
public class AnimeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    @ElementCollection
    private List<String> genero;

    @Column(nullable = false)
    @Size(max = 1000, message = "O descrição deve ter no maximo 1000 caracteres")
    private String sinopse;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") // Formato especificado
    private LocalDate anoDeLancamento;


    @Column(nullable = false)
    @Lob
    private byte[] imagem;
}
