package com.dblcy.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author daibing
 * @since 2022/5/26
 */
@SpringBootApplication
public class GuaGauOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuaGauOrderApplication.class, args);
    }

    /**
     *
     */
    @Value("${spring.application.name}")
    private String name;
}
