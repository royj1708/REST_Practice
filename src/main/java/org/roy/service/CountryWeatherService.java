package org.roy.service;


import org.roy.dto.CountryWeatherResponse;
import org.roy.utils.CountryUtils;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;


@Service
public class CountryWeatherService {


    private final CountryService countryService;
    private final WeatherService weatherService;

    private static final Logger logger = LoggerFactory.getLogger(CountryWeatherService.class);

    public CountryWeatherService(CountryService countryService, WeatherService weatherService) {
        this.countryService = countryService;
        this.weatherService = weatherService;
    }

    public CountryWeatherResponse getWeatherInCapital(String country){
        String capital = CountryUtils.extractCapital(countryService.getCountryInfo(country).get("capital"));
        logger.info(String.format("the capital of %s is %s", country, capital));

        Map<String, Object> weather = ((Map<String, Object>) weatherService.getWeather(capital));
        Map<String, Object> weatherData = (Map<String, Object>) weather.get("main");
        double temperature = (Double) weatherData.get("temp");
        int humidity = (Integer) weatherData.get("humidity");
        String description = ((Map<String, Object>)((List<Object>) weather.get("weather")).get(0)).get("description").toString();

        return new CountryWeatherResponse(
                country,
                capital,
                temperature,
                description,
                humidity
        );
    }

}
