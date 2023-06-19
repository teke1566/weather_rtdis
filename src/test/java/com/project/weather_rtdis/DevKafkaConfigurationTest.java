package com.project.weather_rtdis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.weather_rtdis.config.DevKafkaConfiguration;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DevKafkaConfigurationTest {

    @Autowired
    private DevKafkaConfiguration devKafkaConfiguration;

    @Test
    public void testDevKafkaConfigurationProperties() {

        String expectedTopic = "weather-topic";
        String expectedBootstrapServers = "localhost:9092";
        String expectedKeySerializer = "org.apache.kafka.common.serialization.StringSerializer";
        String expectedValueSerializer =
                "org.springframework.kafka.support.serializer.JsonSerializer";

        assertEquals( expectedTopic, devKafkaConfiguration.getTopic() );
        assertEquals( expectedBootstrapServers, devKafkaConfiguration.getBootstrapServers() );
        assertEquals( expectedKeySerializer, devKafkaConfiguration.getKeySerializer() );
        assertEquals( expectedValueSerializer, devKafkaConfiguration.getValueSerializer() );
    }
}
