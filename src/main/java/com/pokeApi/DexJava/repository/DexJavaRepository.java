package com.pokeApi.DexJava.repository;

import com.pokeApi.DexJava.model.DexJavaPokemonModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DexJavaRepository extends CrudRepository<DexJavaPokemonModel, Integer> {
}
