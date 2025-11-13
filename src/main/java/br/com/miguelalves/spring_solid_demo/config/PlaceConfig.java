package br.com.miguelalves.spring_solid_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import br.com.miguelalves.spring_solid_demo.repository.PlaceRepository;
import br.com.miguelalves.spring_solid_demo.service.PlaceService;

@Configuration
@EnableR2dbcAuditing
public class PlaceConfig {

    @Bean
    PlaceService placeService(PlaceRepository placeRepository) {
        return new PlaceService(placeRepository);
    }
}
