package com.jyz.demo.smsTemplate.controller;

import box.template.MessageSmsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class SmstemplateController {

    @Autowired
    private MessageSmsTemplate messageSmsTemplate;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        try {
            messageSmsTemplate.sendMessage("13279238822", "{\"code\":\"0727\"}");
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "sendMessage";
    }
}
