package com.EMSI.Voiture.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.EMSI.Voiture") // Adjust package name if necessary
public class FeignConfig {
    // No need to define ClientService bean explicitly if Feign clients are in component scan range
}
