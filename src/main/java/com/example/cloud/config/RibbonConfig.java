package com.example.cloud.config;//package com.example.learn.sublearn.sublearn.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: demo
 * @description: ribbon config
 * @author: Wei.Wang
 * @create: 2019-11-22 22:53
 **/

@Configuration
public class RibbonConfig{

  @LoadBalanced
  @Bean
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }

}

