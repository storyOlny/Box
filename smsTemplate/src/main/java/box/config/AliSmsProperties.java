package box.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Data
@ConfigurationProperties(prefix = "aliyun.sms")
public class AliSmsProperties {
    private String accessKeyId;
    private String secretAccessKey;
    private String endpoint;
    private String regionId;
    private String signName;
    private String templateCode;
}
