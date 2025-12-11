package com.pokeApi.DexJava.repository;

import com.pokeApi.DexJava.model.DexJavaPokemonModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DexJavaRepository extends JpaRepository<DexJavaPokemonModel, Long> {
}
