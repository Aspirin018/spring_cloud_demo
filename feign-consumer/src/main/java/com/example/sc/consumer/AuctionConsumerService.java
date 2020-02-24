package com.example.sc.consumer;

import com.example.sc.fallback.AuctionConsumerFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "auction-service", fallback = AuctionConsumerFallback.class)
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
