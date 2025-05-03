package org.roy.controller;


import org.roy.dto.CountryWeatherResponse;
import org.roy.service.CountryWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/countryweather")
public class CountryWeatherController {

    @Autowired
    private CountryWeatherService countryWeatherService;

    @GetMapping("/{country}")
    public CountryWeatherResponse getWeatherInCapital(@PathVariable String country){
        return countryWeatherService.getWeatherInCapital(country);
    }

}
