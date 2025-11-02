package com.example.pokeapi.Service;

import com.example.pokeapi.Model.Pokemon;
import com.example.pokeapi.Model.PokemonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class PokemonService {


    private final WebClient webClient;

    /*
    Inyecta el bean tipo webClient
     */
    @Autowired
    public PokemonService(WebClient webClient) {
        this.webClient = webClient;
    }

    /*
    Recibe el JSON y lo convierte en
    un objeto tipo pokemon
     */

    public Mono<Pokemon> getPokemonByname(String name) {
        return webClient.get()
                .uri("/{name}", name)
                .retrieve()
                .bodyToMono(Pokemon.class);
    }

    /*
    Recibe el JSON y mapea las habilidades de la
    de la clase pokemon a una lista de tipo string
    para luego crear el objeto PokemonResponse
     */

    public Mono<PokemonResponse> getPokemonResponseByname(String name) {
        return webClient.get()
                .uri("/{name}", name)
                .retrieve()
                .bodyToMono(Pokemon.class)
                .map(pokemon -> {
                    List<String> abilities = pokemon.getAbilities().stream()
                            .map(abilityWrapper -> abilityWrapper.getAbility().getName())
                            .toList();

                    return new PokemonResponse(
                            pokemon.getName(),
                            pokemon.getWeight(),
                            abilities
                    );
                });
    }
}













