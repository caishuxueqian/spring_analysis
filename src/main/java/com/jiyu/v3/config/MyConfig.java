package com.jiyu.v3.config;

import com.jiyu.v3.entity.Win10Entity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(Win10Entity.class)
public class MyConfig {

    /**
     * Import作用主要讲外部的jar包注入到springioc容器 @Import(Win10Entity.class) 等于 @Bean
     * Import注册的bean对象 id为当前类全路径
     */
//    @Conditional(MyCondition.class)
//    @Bean
//    public Win10Entity win10Entity(){
//        return new Win10Entity();
//    }

    /**
     * @Import注解与@Bean注解的区别
     * bean注解注册的bean的id是方法名称 @Import以当前类完整路径地址注册 相比来说@Import注入更加简单
     * 共同点：都是引入外部的jar包
     */
}
