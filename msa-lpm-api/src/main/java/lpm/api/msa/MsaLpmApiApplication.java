package lpm.api.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsaLpmApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaLpmApiApplication.class, args);
    }

}
