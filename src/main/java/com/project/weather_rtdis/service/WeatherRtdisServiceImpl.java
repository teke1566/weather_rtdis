package com.project.weather_rtdis.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherRtdisServiceImpl implements WeatherRtdisService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value( "${app.weather.url}" )
    private String apiUrl;

    @Value( "${app.weather.acess.key}" )
    private String accesskey;

    @Override
    public WeatherDTO fetchCurrentWeatherData( String city ) {

        String currentUrl = apiUrl
                + "/current?access_key=" + accesskey + "&query=" + city;

        WeatherDTO weatherDTO = restTemplate.getForObject( currentUrl, WeatherDTO.class );
        return weatherDTO;
    }


    @Override
    public WeatherDTO fetchHistoricalWeatherData() {

        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public WeatherDTO fetchForecastWeatherData() {

        // TODO Auto-generated method stub
        return null;
    }

}
