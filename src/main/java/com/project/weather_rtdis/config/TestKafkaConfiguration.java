package com.project.weather_rtdis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile( "test" )
public class TestKafkaConfiguration {

    @Value( "${test.upstash.kafka.topic}" )
    private String topic;

    @Value( "${test.upstash.kafka.bootstrap-servers}" )
    private String bootstrapServers;

    @Value( "${test.upstash.kafka.sasl.mechanism}" )
    private String saslMechanism;

    @Value( "${test.upstash.kafka.security.protocol}" )
    private String securityProtocol;

    @Value( "${test.upstash.kafka.sasl.jaas.config}" )
    private String saslJaasConfig;

    // Getters

    public String getTopic() {

        return topic;
    }


    public String getBootstrapServers() {

        return bootstrapServers;
    }


    public String getSaslMechanism() {

        return saslMechanism;
    }


    public String getSecurityProtocol() {

        return securityProtocol;
    }


    public String getSaslJaasConfig() {

        return saslJaasConfig;
    }
}
