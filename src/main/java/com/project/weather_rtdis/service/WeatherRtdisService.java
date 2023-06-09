package com.project.weather_rtdis.service;

public interface WeatherRtdisService {

    WeatherDTO fetchCurrentWeatherData( String city );


    WeatherDTO fetchHistoricalWeatherData();


    WeatherDTO fetchForecastWeatherData();
}
