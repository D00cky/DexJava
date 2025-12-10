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

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AbilityWrapper{
        @JsonProperty("ability")
        private AbilityDetail pokemonAbilities;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AbilityDetail {
        private String name;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TypesWrapper {
        @JsonProperty("type")
        private TypesDetail pokemonTypes;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TypesDetail {
        private String name;
    }
}
