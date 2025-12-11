package com.pokeApi.DexJava.service;

import com.pokeApi.DexJava.repository.DexJavaRepository;
import com.pokeApi.DexJava.model.DexJavaPokemonModel;
import com.pokeApi.DexJava.dto.DexJavaResponseDTO;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class DexJavaService {

    private final RestClient restClient;
    private final DexJavaRepository repository;

    public DexJavaService(RestClient.Builder builder, DexJavaRepository repository) {
        this.repository = repository;
        this.restClient = builder.baseUrl("https://pokeapi.co/api/v2/pokemon").build();
    }

    public DexJavaPokemonModel searchPokemon(String name) {
        DexJavaResponseDTO dto = restClient.get()
                .uri("/{name}",name)
                .retrieve()
                .body(DexJavaResponseDTO.class);

        if (dto == null) return null;

        DexJavaPokemonModel newPokemon = new DexJavaPokemonModel();

        newPokemon.setName(dto.getPokemonName()); //get from the JSON the name, pokedexID and baseXP from the JSON in the DTO.
        newPokemon.setPokedexId(dto.getPokemonId());
        newPokemon.setXp(dto.getPokemonBaseXp());

        if(dto.getPokemonAbilities() != null && !dto.getPokemonAbilities().isEmpty()) {
            String ability = dto.getPokemonAbilities().get(0).getPokemonAbilities().getName();
            newPokemon.setAbilities(ability);
        }

        if (dto.getPokemonTypes() != null && !dto.getPokemonTypes().isEmpty()){
            String type = dto.getPokemonTypes().get(0).getPokemonTypes().getName();
            newPokemon.setType(type);
        }
        return repository.save(newPokemon);
    }

    public List<DexJavaPokemonModel> getAllPokemons() {
        List<DexJavaPokemonModel> allPokemons = new ArrayList<DexJavaPokemonModel>();
        repository.findAll().forEach(dexJavaPokemonModel -> allPokemons.add(dexJavaPokemonModel));
        return allPokemons;
    }
}
