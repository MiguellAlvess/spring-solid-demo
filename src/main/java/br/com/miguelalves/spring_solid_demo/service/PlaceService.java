package br.com.miguelalves.spring_solid_demo.service;

import br.com.miguelalves.spring_solid_demo.api.PlaceRequest;
import br.com.miguelalves.spring_solid_demo.domain.Place;
import br.com.miguelalves.spring_solid_demo.repository.PlaceRepository;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(PlaceRequest placeRequest) {
        var place = new Place(null, placeRequest.name(), placeRequest.slug(), placeRequest.state(),
                placeRequest.createdAt(), placeRequest.updatedAt());
        return placeRepository.save(place);
    }
}
