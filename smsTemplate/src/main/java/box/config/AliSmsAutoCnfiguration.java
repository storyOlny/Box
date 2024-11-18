package box.config;

import box.template.MessageSmsTemplate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 18108
 */
@EnableConfigurationProperties(AliSmsProperties.class)
@Configuration
@ConditionalOnProperty(name = "aliyun.sms.enable", havingValue = "true", matchIfMissing = true)
public class AliSmsAutoCnfiguration {
    @Bean
    public MessageSmsTemplate aliSmsTemplate(AliSmsProperties aliSmsProperties) {
        return new MessageSmsTemplate(aliSmsProperties);
    }
}
