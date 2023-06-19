package com.project.weather_rtdis.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.project.weather_rtdis.service.WeatherDTO;

@Service
public class KafkaProducer {

    private KafkaTemplate<String, WeatherDTO> kafkaTemplate;

    @Autowired
    public KafkaProducer( KafkaTemplate<String, WeatherDTO> kafkaTemplate ) {

        this.kafkaTemplate = kafkaTemplate;
    }

    //@Value( "${kafka.topic}" )
    //private String topic;

    public void sendWeatherData( WeatherDTO weatherDTO ) {

        //kafkaTemplate.send( topic, weatherDTO );
    }
}
