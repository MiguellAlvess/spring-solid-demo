package br.com.miguelalves.spring_solid_demo.api;

import jakarta.validation.constraints.NotBlank;

public record PlaceRequest(@NotBlank String name, @NotBlank String state) {
}
