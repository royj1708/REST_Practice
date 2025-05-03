package org.roy.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;
import static org.roy.utils.Constants.*;

@Service
public class CountryService {

    private final RestTemplate restTemplate = new RestTemplate();


    public Map getCountryInfo(String name){
        String url = String.format(COUNTRY_BASE_URL + NAME + "/%s", name);

        Map[] response = restTemplate.getForObject(url, Map[].class);
        return response != null && response.length > 0 ? response[0] : null;
    }

}
