package gk.uk.sdp_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SdpGatewayApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SdpGatewayApplication.class, args);
    }

}
