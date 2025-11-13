package br.com.miguelalves.spring_solid_demo.service;

import br.com.miguelalves.spring_solid_demo.api.PlaceRequest;
import br.com.miguelalves.spring_solid_demo.domain.Place;
import br.com.miguelalves.spring_solid_demo.repository.PlaceRepository;
import com.github.slugify.Slugify;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;
    private Slugify slg;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.slg = Slugify.builder().build();
    }

    public Mono<Place> create(PlaceRequest placeRequest) {
        var place = new Place(null, placeRequest.name(), slg.slugify(placeRequest.slug()), placeRequest.state(),
                placeRequest.createdAt(), placeRequest.updatedAt());
        return placeRepository.save(place);
    }
}
