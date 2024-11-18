# box 通用sdk
适配简单通用的sdk案例，方便后续开发
### 1.0 短信验证码
##### 1.1.0提供阿里云短信验证码sdk
1.引入sdk包

     <dependency>
            <groupId>com.jyz</groupId>
            <artifactId>smsTemplate</artifactId>
            <version>2.0-SNAPSHOT</version>
     </dependency>
2.配置文件

    aliyun:
        sms:
            enable: true
            accessKeyId: xxx
            secretAccessKey: xxx
            endpoint: dysmsapi.aliyuncs.com
            regionId: cn-hangzhou
            signName: 阿里云短信测试
            templateCode: SMS_154950909
3.引入发送类直接调用发送方法
                    
        @Autowired
        private MessageSmsTemplate messageSmsTemplate;
        messageSmsTemplate.sendMessage("13279238822", "{\"code\":\"0727\"}");
##### 1.2.0阿里云短信验证码案例
参考box-demo中的smsTemplate案例
