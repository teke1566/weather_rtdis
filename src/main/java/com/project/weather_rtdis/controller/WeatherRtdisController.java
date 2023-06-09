package com.project.weather_rtdis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.weather_rtdis.service.WeatherDTO;
import com.project.weather_rtdis.service.WeatherRtdisService;

@RestController
@RequestMapping( "weather/" )
public class WeatherRtdisController {

    @Autowired
    private WeatherRtdisService weatherRtdisService;

    @GetMapping( "current/{city}" )
    public ResponseEntity<WeatherDTO> fetchCurrentWeatherData( @PathVariable String city ) {

        WeatherDTO weatherDTO = weatherRtdisService.fetchCurrentWeatherData( city );
        return new ResponseEntity<WeatherDTO>( weatherDTO, HttpStatus.OK );
    }
}
