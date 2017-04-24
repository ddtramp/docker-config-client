package com.microservice.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jack on 22/04/2017.
 */
@RestController
@RefreshScope
public class EventController {
    @Value("${feature.x.enable}")
    String featureXEnable;

    @RequestMapping("/")
    String index() {
        if (Boolean.valueOf(featureXEnable)) { return "Feature X Is Enabled"; }
        return "Event Controller is handling logic without Feature X";
    }
}




