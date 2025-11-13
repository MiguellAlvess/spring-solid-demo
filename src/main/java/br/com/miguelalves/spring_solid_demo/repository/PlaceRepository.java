package br.com.miguelalves.spring_solid_demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import br.com.miguelalves.spring_solid_demo.domain.Place;

public interface PlaceRepository extends ReactiveCrudRepository<Place, Long> {

}
