package com.project.weather_rtdis.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

import com.project.weather_rtdis.service.WeatherDTO;

public class KafkaProducer {

    private KafkaTemplate<String, WeatherDTO> kafkaTemplate;

    @Autowired
    public KafkaProducer( KafkaTemplate<String, WeatherDTO> kafkaTemplate ) {

        this.kafkaTemplate = kafkaTemplate;
    }

    @Value( "${kafka.topic}" )
    private static String topic;

    public void sendWeatherData( WeatherDTO weatherDTO ) {

        kafkaTemplate.send( topic, weatherDTO );
    }
}
