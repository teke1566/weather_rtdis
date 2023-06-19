package com.project.weather_rtdis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile( "dev" )
public class DevKafkaConfiguration {

    @Value( "${dev.kafka.topic}" )
    private String topic;

    @Value( "${spring.kafka.bootstrap-servers}" )
    private String bootstrapServers;

    @Value( "${spring.kafka.producer.key-serializer}" )
    private String keySerializer;

    @Value( "${spring.kafka.producer.value-serializer}" )
    private String valueSerializer;

    // Getters

    public String getTopic() {

        return topic;
    }


    public String getBootstrapServers() {

        return bootstrapServers;
    }


    public String getKeySerializer() {

        return keySerializer;
    }


    public String getValueSerializer() {

        return valueSerializer;
    }
}
