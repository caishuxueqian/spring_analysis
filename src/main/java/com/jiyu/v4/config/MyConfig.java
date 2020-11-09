package com.jiyu.v4.config;

import com.jiyu.v4.ServiceImpl.OrderServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 别忘了扫包，不然无法注入bean
 */
@ComponentScan("com.jiyu.v4")
@Configuration
public class MyConfig {
}
