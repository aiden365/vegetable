package cc.provider.dept;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class NacosProviderDeptStart1 {

    public static void main(String[] args) {

        log.info(System.getProperty("java.version"));

        SpringApplication.run(NacosProviderDeptStart1.class, args);
    }
}
