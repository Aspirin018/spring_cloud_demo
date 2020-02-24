package com.example.sc.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumeService {

    @Autowired
    RestTemplate restTemplate;

//    @HystrixCommand(fallbackMethod = "consumeFallback")
//    public String consumeWithHystrix() {
//        return restTemplate.getForEntity("http://AUCTION-SERVICE/index", String.class).getBody();
//    }

    public String consumeFallback() {
        return "consume auction server error.";
    }
}
