package com.example.sc.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("auction-service")
public interface AuctionConsumerService {

    @RequestMapping("/index")
    String consumeAuction();

    @GetMapping("/show-name")
    String showGoodsName(@RequestParam("name") String name);

    @GetMapping("/auction-goods")
    Goods auctionGoods(@RequestHeader("name") String name, @RequestHeader("price") double price);

    @PostMapping("/show-info")
    String showInfo(@RequestBody Goods goods);
}
