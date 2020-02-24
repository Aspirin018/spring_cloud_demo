package com.example.sc.auction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuctionController {

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/index")
    public String auctionIndex() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        LOGGER.info("/auction-index, host:" + serviceInstance.getHost() + ", serviceId: " + serviceInstance.getServiceId());
        LOGGER.info("/auction-index, metadata:" + serviceInstance.getMetadata());
        return "auction index.";
    }
}
