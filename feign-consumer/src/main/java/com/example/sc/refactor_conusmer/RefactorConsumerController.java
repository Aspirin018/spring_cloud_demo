package com.example.sc.refactor_conusmer;

import com.example.sc.auction.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactorConsumerController {

    @Autowired
    RefactorConsumerService refactorConsumerService;

    @GetMapping(value="/feign-consumer-refactor")
    public String auctionConsumerRefactor(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(refactorConsumerService.auctionRefactor1("apple")).append("\n");
        stringBuilder.append(refactorConsumerService.auctionRefactor2("peach", 20d)).append("\n");
        stringBuilder.append(refactorConsumerService.auctionRefactor3(new Goods("peach", 20d))).append("\n");
        return stringBuilder.toString();
    }
}
