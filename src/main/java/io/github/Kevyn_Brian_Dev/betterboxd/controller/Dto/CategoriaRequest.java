package io.github.Kevyn_Brian_Dev.betterboxd.controller.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoriaRequest(

        @NotBlank
        @Size(min = 2, max = 50)
        String nome
) {
}
