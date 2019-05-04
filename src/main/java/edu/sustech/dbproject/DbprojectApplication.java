package edu.sustech.dbproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("edu.sustech.dbproject.dao")
public class DbprojectApplication{

    public static void main(String[] args) {
        SpringApplication.run(DbprojectApplication.class, args);
//        SpringApplication app = SpringApplication(DbprojectApplication::class.java);
//        new SpringApplicationBuilder(DbprojectApplication.class).web(WebApplicationType.REACTIVE).run(args);
    }

}
