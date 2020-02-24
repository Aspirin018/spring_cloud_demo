package com.example.sc.fallback;

import com.example.sc.auction.AuctionService;
import com.example.sc.auction.Goods;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class AuctionConsumerFallback implements AuctionService {

    @Override
    public String auctionRefactor1(@RequestParam("name") String name) {
        return "error";
    }

    @Override
    public Goods auctionRefactor2(@RequestHeader("name") String name, @RequestHeader("price") double price) {
        return new Goods("Unknown", 0);
    }

    @Override
    public String auctionRefactor3(@RequestBody Goods goods) {
        return "error";
    }
}
