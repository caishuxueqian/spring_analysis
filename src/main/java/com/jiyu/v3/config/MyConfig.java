package com.jiyu.v3.config;

import com.jiyu.v3.entity.Win10Entity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Conditional(MyCondition.class)
    @Bean
    public Win10Entity win10Entity(){
        return new Win10Entity();
    }
}
