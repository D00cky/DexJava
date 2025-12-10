package com.pokeApi.DexJava.repository;

import com.pokeApi.DexJava.model.DexJavaPokemonModel;
import com.pokeApi.DexJava.dto.DexJavaResponseDTO;
import com.pokeApi.DexJava.service.DexJavaService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DexJavaRepository extends JpaRepository<DexJavaPokemonModel, Long> {
}
