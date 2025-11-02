package com.example.pokeapi.Model;

import java.util.List;

public class WeatherResponse {
    private String cod;
    private int message;
    private int cnt;
    private List<WeatherItem> list;
    private City city;

    // Getters y Setters
    public String getCod() { return cod; }
    public void setCod(String cod) { this.cod = cod; }

    public int getMessage() { return message; }
    public void setMessage(int message) { this.message = message; }

    public int getCnt() { return cnt; }
    public void setCnt(int cnt) { this.cnt = cnt; }

    public List<WeatherItem> getList() { return list; }
    public void setList(List<WeatherItem> list) { this.list = list; }

    public City getCity() { return city; }
    public void setCity(City city) { this.city = city; }

}
