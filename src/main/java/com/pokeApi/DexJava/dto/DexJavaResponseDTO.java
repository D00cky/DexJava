package com.pokeApi.DexJava.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DexJavaResponseDTO {

    @JsonProperty("id")
    private Integer pokemonId;

    @JsonProperty("name")
    private String pokemonName;

    @JsonProperty("base_experience")
    private Integer pokemonBaseXp;

    @JsonProperty("abilities")
    private List<AbilityWrapper> pokemonAbilities;

    @JsonProperty("types")
    private List<TypesWrapper> pokemonTypes;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AbilityWrapper{
        private AbilityDetail pokemonAbilities;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AbilityDetail {
        private String name;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TypesWrapper {
        private TypesDetail pokemonTypes;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TypesDetail {
        private String name;
    }
}
