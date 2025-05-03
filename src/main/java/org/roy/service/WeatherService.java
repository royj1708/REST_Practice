package org.roy.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;
import static org.roy.utils.Constants.*;


@Service
public class WeatherService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${openweathermap.api.key}")
    private String apiKey;

    public Map getWeather(String city){
        String url = String.format(WEATHER_BASE_URL + "?q=%s&appid=%s&units=metric" , city, apiKey);
        Map response = restTemplate.getForObject(url, Map.class);
        return response;
    }


}
