package com.example.sc.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("auction-service")
public interface AuctionConsumerService {

    @RequestMapping("/index")
    String consumeAuction();
}
