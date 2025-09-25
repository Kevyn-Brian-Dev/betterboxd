package io.github.Kevyn_Brian_Dev.betterboxd.controller;

import io.github.Kevyn_Brian_Dev.betterboxd.controller.Dto.CategoriaRequest;
import io.github.Kevyn_Brian_Dev.betterboxd.service.CategoriaService;
import io.github.Kevyn_Brian_Dev.betterboxd.controller.Dto.CategoriaResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public ResponseEntity<CategoriaResponse> criar(@RequestBody @Valid CategoriaRequest request){
        var response = categoriaService.criar(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
}
