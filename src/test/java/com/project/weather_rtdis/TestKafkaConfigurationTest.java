package com.project.weather_rtdis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.weather_rtdis.config.TestKafkaConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class TestKafkaConfigurationTest {

    @Autowired
    private TestKafkaConfiguration testKafkaConfiguration;

    @Test
    public void testTestKafkaConfigurationProperties() {

        String expectedTopic = "weather-topic";
        String expectedBootstrapServers = "diverse-cricket-6162-us1-kafka.upstash.io:9092";
        String expectedSaslMechanism = "SCRAM-SHA-256";
        String expectedSecurityProtocol = "SASL_SSL";
        String expectedSaslJaasConfig =
                "org.apache.kafka.common.security.scram.ScramLoginModule required " +
                        "username=\"ZGl2ZXJzZS1jcmlja2V0LTYxNjIkw2Ipwr2_IzTYVVCXm9l4qnHIxGkjY_jl6Hw\" "
                        +
                        "password=\"ec8f377d34be457c803fddc48e5992c9\";";

        assertEquals( expectedTopic, testKafkaConfiguration.getTopic() );
        assertEquals( expectedBootstrapServers, testKafkaConfiguration.getBootstrapServers() );
        assertEquals( expectedSaslMechanism, testKafkaConfiguration.getSaslMechanism() );
        assertEquals( expectedSecurityProtocol, testKafkaConfiguration.getSecurityProtocol() );
        assertEquals( expectedSaslJaasConfig, testKafkaConfiguration.getSaslJaasConfig() );
    }
}