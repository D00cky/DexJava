package com.pokeApi.DexJava.controller;

import com.pokeApi.DexJava.service.DexJavaService;
import com.pokeApi.DexJava.model.DexJavaPokemonModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(path ="/api/pokemons")
public class DexJavaController {

    @Autowired
    DexJavaService service;

    @GetMapping("/pikachu")
    public String getPokeName() {
        String url = "https://pokeapi.co/api/v2/pokemon/pikachu";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }


}
