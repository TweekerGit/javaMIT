package org.obrii.mit.dp2021.restServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestServicesRun {

  public static void main(String[] args) {
        SpringApplication.run(RestServicesRun.class, args);
    }
        @Bean
        public RestTemplate restTemplate(RestTemplateBuilder builder){
            return builder.build();
        }
}