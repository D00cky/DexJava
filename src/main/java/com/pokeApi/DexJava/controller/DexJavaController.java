package com.pokeApi.DexJava.controller;

import com.pokeApi.DexJava.dto.DexJavaResponseDTO;
import com.pokeApi.DexJava.service.DexJavaService;
import com.pokeApi.DexJava.model.DexJavaPokemonModel;

import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<DexJavaPokemonModel> capture(@PathVariable String name) {
        DexJavaPokemonModel pokemon = service.searchByName(name);
        if(pokemon == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(pokemon);
    }
}

