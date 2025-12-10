package com.pokeApi.DexJava.controller;

import com.pokeApi.DexJava.dto.DexJavaResponseDTO;
import com.pokeApi.DexJava.service.DexJavaService;
import com.pokeApi.DexJava.model.DexJavaPokemonModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(path ="/api/pokemons")
public class DexJavaController {

    @Autowired
    DexJavaService service;

    @GetMapping(path="/{name}")
    public ResponseEntity<DexJavaResponseDTO> getPokemon(@PathVariable String name) {
        DexJavaPokemonModel dexJavaPokemonModel =
    }
}
