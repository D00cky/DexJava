package com.pokeApi.DexJava.service;

import com.pokeApi.DexJava.repository.DexJavaRepository;
import com.pokeApi.DexJava.model.DexJavaPokemonModel;
import com.pokeApi.DexJava.dto.DexJavaResponseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class DexJavaService {

    @Autowired
    DexJavaRepository repository;

    public String findByName(@PathVariable("name") String name) {
        RestClient restClient = RestClient.create();
        String pokeName = restClient.get()
                .uri("https://pokeapi.co/api/v2/pokemon/{name}", name)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(String.class);
        return pokeName;

}
}
