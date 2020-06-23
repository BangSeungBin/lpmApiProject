package gateway.api.msa;

import gateway.api.msa.filter.GatewayFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class MsaApiGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsaApiGatewayApplication.class, args);
	}

	@Bean
	public GatewayFilter gatewayFilter() {
		return new GatewayFilter();
	}
}
