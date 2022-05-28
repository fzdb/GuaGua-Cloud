package com.dblcy.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 系统启动类
 *
 * @author daibing
 * @since 2022/5/26
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GuaGuaSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuaGuaSystemApplication.class, args);
    }

}
