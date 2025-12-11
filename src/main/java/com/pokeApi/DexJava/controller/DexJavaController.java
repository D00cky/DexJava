package com.pokeApi.DexJava.controller;

import com.pokeApi.DexJava.service.DexJavaService;
import com.pokeApi.DexJava.model.DexJavaPokemonModel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/api/pokemons")
public class DexJavaController {

    private final DexJavaService service;

    public DexJavaController(DexJavaService service) {
        this.service = service;
    }

    @GetMapping("/{name}")
    public ResponseEntity<DexJavaPokemonModel> captureByName(@PathVariable String name) {
        DexJavaPokemonModel pokemon = service.searchPokemon(name); //takes the name of the pokemon or the pokedex id
        if(pokemon == null) {                                     //example bulbassaur or pokedex ID:1
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(pokemon);
    }
}

