package com.example.cloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud
 * @description:   ribbon 会获取到所有服务列表以及服务对应的 ip 地址和端口号，通过某种算法，选取一个 ip 和端口，替换掉请求里的服务名，从而达到【请求均衡】的目的
 * @author: Wei.Wang
 * @create: 2019-11-23 19:10
 **/

public class RibbonTest implements CommandLineRunner{

  @Autowired
  RestTemplate restTemplate;


  @Override
  public void run(String... args) throws Exception{
    Object o =   restTemplate.getForObject("http://eureka-server/player/findById?Id=1",  Object.class);
    System.out.println("测试 ribbon"+ o);
  }
}

