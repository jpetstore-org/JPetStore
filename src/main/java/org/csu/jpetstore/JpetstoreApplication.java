package org.csu.jpetstore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.csu.jpetstore"})
@MapperScan("org.csu.jpetstore.persistence")
public class JpetstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpetstoreApplication.class, args);
    }

}
