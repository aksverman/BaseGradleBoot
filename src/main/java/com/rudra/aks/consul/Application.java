package com.rudra.aks.consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello! App is working.";
    }

    public static void main(String[] args) {
        System.getProperties().put("server.port", 8910);
    	new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}