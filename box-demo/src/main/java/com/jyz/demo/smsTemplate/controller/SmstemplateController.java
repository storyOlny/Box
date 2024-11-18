package com.jyz.demo.smsTemplate.controller;

import box.template.MessageSmsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class SmstemplateController {

    @Autowired
    private MessageSmsTemplate messageSmsTemplate;

    /**
     * 短信测试接口，param参数可以自定义，但是要和模板中的参数对应上
     * @param number 手机号码
     * @return
     */
    @PostMapping("/sendMessage")
    public String sendMessage(String number) {
        try {
            messageSmsTemplate.sendMessage(number, "{\"code\":\"0727\"}");
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "sendMessage success.";
    }
}
