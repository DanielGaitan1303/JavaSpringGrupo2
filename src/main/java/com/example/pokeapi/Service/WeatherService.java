package com.example.pokeapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.pokeapi.Model.WeatherResponse;

import reactor.core.publisher.Mono;

@Service
public class WeatherService {
    @Value("${weather.api.key}")
    private String apiKey;


    private final WebClient webClient;


    @Autowired
    public WeatherService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<WeatherResponse> getWeatherbyCity(String city) {
        return webClient.get()
                .uri(UriBuilder -> UriBuilder
                    .path("/forecast")
                    .queryParam("q", city)
                    .queryParam("appid", apiKey)
                    .build())
                .retrieve()
                .bodyToMono(WeatherResponse.class);
    }

}













