package br.com.miguelalves.spring_solid_demo.web;

import br.com.miguelalves.spring_solid_demo.api.PlaceResponse;
import br.com.miguelalves.spring_solid_demo.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
