package com.project.encode;

import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class EncryptorComponent {


    /**
     *         <!--项目加密-->
     *         <dependency>
     *             <groupId>com.github.ulisesbocchio</groupId>
     *             <artifactId>jasypt-spring-boot-starter</artifactId>
     *             <version>3.0.3</version>
     *         </dependency>
     */
    @Value("${kafka.url}")
    private String kafkaUrl;

    private String ip = "10.120.52.2:9092,10.120.52.3:9092,10.120.52.4:9092";
    @Autowired
    StringEncryptor encryptor;

    @PostMapping("/encryptor")
    public void encryptorFunction(){
        log.info("加密后密文,{}",encryptor.encrypt(String.valueOf(kafkaUrl)));
        log.info("原始明文，{}",kafkaUrl);
    }
}