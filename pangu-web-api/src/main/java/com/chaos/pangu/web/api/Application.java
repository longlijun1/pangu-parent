package com.chaos.pangu.web.api;

import java.util.Date;
import org.apache.commons.lang.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = {"com.chaos.pangu.web.biz.dao"})
@EnableAspectJAutoProxy
@EnableConfigurationProperties
@EnableScheduling
@ServletComponentScan
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.chaos.pangu.web.api", "com.chaos.pangu.web.biz"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Converter<String, Date> addNewConverter() {
        return new Converter<String, Date>() {
            @Override
            public Date convert(String milliseconds) {
                if (StringUtils.isBlank(milliseconds)) {
                    return new Date();
                }
                long l = Long.parseLong(milliseconds);
                Date date = new Date(l);
                return date;
            }
        };
    }
}
