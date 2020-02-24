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


    @GetMapping(value="/feign-consumer-with-param")
    public String auctionConsumerWithParams(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(auctionConsumerService.showGoodsName("apple")).append("\n");
        stringBuilder.append(auctionConsumerService.auctionGoods("peach", 20d)).append("\n");
        stringBuilder.append(auctionConsumerService.showInfo(new Goods("peach", 20d))).append("\n");
        return stringBuilder.toString();
    }
}
