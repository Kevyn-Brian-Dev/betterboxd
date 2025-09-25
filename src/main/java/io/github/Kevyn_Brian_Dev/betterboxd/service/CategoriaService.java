package io.github.Kevyn_Brian_Dev.betterboxd.service;

import io.github.Kevyn_Brian_Dev.betterboxd.controller.Dto.CategoriaRequest;
import io.github.Kevyn_Brian_Dev.betterboxd.controller.Dto.CategoriaResponse;
import io.github.Kevyn_Brian_Dev.betterboxd.entity.Categoria;
import io.github.Kevyn_Brian_Dev.betterboxd.repositories.CategoriaRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Transactional
    public CategoriaResponse criar(@Valid CategoriaRequest request){

        Categoria categoria = new Categoria(request.nome());
        var response = categoriaRepository.save(categoria);
        return new CategoriaResponse(response.getId(),response.getNome());
    }


}
