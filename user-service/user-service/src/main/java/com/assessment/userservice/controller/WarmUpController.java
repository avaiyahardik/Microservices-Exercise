package com.assessment.userservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WarmUpController {
    @GetMapping("/_ah/warmup")
    public String warmupRequestReceiver() {
        var msg = "[user-service] warm up request successfully received.";
        log.info(msg);
        return msg;
    }
}
