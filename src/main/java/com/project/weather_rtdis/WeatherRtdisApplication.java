package com.project.weather_rtdis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

import com.project.weather_rtdis.integration.KafkaProducer;
import com.project.weather_rtdis.service.WeatherDTO;
import com.project.weather_rtdis.service.WeatherDTO.CurrentDTO;

@SpringBootApplication
@EnableKafka
public class WeatherRtdisApplication implements CommandLineRunner {

    @Autowired
    private KafkaProducer kafkaProducer;

    public static void main( String[] args ) {

        SpringApplication.run( WeatherRtdisApplication.class, args );
    }


    @Override
    public void run( String... args ) throws Exception {

        WeatherDTO weatherDTO = new WeatherDTO();
        CurrentDTO currentDTO = new CurrentDTO();
        currentDTO.setVisibility( 1 );
        weatherDTO.setCurrent( currentDTO );
        kafkaProducer.sendWeatherData( weatherDTO );

    }

}
