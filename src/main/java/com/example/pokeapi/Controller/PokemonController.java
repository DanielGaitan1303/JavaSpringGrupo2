package com.example.pokeapi.Controller;

import com.example.pokeapi.Model.Pokemon;
import com.example.pokeapi.Model.PokemonResponse;
import com.example.pokeapi.Service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/pokemon")
/*
Clase encargada de hacer las peticiones get
 */
public class PokemonController {

    private final PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    /*
    Peticion tipo get con la estructura del JSON orginial
     */
    @GetMapping("/{name}")
    public Mono<Pokemon> getPokemonbyname(@PathVariable String name) {
        return pokemonService.getPokemonByname(name);
    }
    /*
    Peticion tipo get con la estructura de la clase personalizada
     */

    @GetMapping("/onlydat/{name}")
    public Mono<PokemonResponse> getPokemonResponseByName(@PathVariable  String name) {
        return pokemonService.getPokemonResponseByname(name);
    }


}
