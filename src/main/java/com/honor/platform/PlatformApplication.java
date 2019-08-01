package com.honor.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 戴天赐 on 2019/8/1.
 * SpringBootApplicatio会自动扫描同级目录（com.honor.platform）下的包或者子包
 */
@SpringBootApplication
public class PlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatformApplication.class);
    }
}
