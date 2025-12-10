package com.pokeApi.DexJava.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DexJavaPokemonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pokedex_id")
    private Integer pokedexId;

    @Column(name = "pokemon_name")
    private String name;

    @Column(name = "base_xp")
    private Integer xp;

    @Column(name = "pokemon_ability")
    private String abilities;

    @Column(name = "pokemon_type")
    private String type;

}