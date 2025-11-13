package br.com.miguelalves.spring_solid_demo.api;

import java.time.LocalDateTime;

public record PlaceRequest(String name, String state) {
}
