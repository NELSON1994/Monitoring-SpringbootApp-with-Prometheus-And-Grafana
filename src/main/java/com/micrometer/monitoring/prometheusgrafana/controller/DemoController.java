package com.micrometer.monitoring.prometheusgrafana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/demo/{name}")
    public String expose(@PathVariable("name") String name){
        String bb= name;
        return "My name is : "+name;
    }
//"http://localhost:7575/actuator/prometheus",   url that prometheus uses to get logs
    // pull prometheus using docker

    //docker pull prom/prometheus
    //docker image ls

    // to start prometheus server
//docker run port locationOfPrometheus.yml prometheusImageName
    //docker run -p 7576:7576 D:/ALL PROJECTS/Springboot Monitoring/src/main/resources/prometheus.yml prom/prometheus:latest
 // in browser type ::  http://localhost:port    http://docker-machine-ip-address:port

    //pull grafana image
    //start grafana   => docker run -d --name=grafana -p 8888:8888 pulledImage
// access it on browser=>http://localhost:port    http://docker-machine-ip-address:port
    // login => admin admin as credentials
            //add data source => select prometheus =>do the setting (ip and port where prometheus is running)=> test
            // go to dashboard to configure graph
}
