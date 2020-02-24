package com.example.sc.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuctionConsumerController {

    @Autowired
    AuctionConsumerService auctionConsumerService;

    @GetMapping(value="/feign-consumer")
    public String auctionConsumer(){
        return auctionConsumerService.consumeAuction();
    }
}
