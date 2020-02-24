package com.example.sc.auction;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/refactor")
public interface AuctionService {

    @GetMapping("/auction1")
    String auctionRefactor1(@RequestParam("name") String name);

    @GetMapping("/auction2")
    Goods auctionRefactor2(@RequestHeader("name") String name, @RequestHeader("price") double price);

    @PostMapping("/auction3")
    String auctionRefactor3(@RequestBody Goods goods);
}
