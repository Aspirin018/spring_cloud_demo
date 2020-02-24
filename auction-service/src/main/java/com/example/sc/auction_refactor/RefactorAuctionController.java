package com.example.sc.auction_refactor;

import com.example.sc.auction.AuctionService;
import com.example.sc.auction.Goods;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactorAuctionController implements AuctionService {


    @Override
    public String auctionRefactor1(@RequestParam("name") String name) {
        return "Goods name: " + name;
    }

    @Override
    public Goods auctionRefactor2(@RequestHeader("name") String name, @RequestHeader("price") double price) {
        return new Goods(name, price);
    }

    @Override
    public String auctionRefactor3(@RequestBody Goods goods) {
        return "Goods Info: " + goods.getName() + ", " + goods.getPrice();
    }
}
