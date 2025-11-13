package br.com.miguelalves.spring_solid_demo.service;

import br.com.miguelalves.spring_solid_demo.domain.Place;
import br.com.miguelalves.spring_solid_demo.repository.PlaceRepository;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(Place place) {
        return placeRepository.save(place);
    }
}
