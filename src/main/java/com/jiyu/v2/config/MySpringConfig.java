package com.jiyu.v2.config;

import com.jiyu.entity.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.jiyu.v2")
@Configuration
public class MySpringConfig {
    // @Configuration等同于spring xml

    /**
     * <bean id="userEntity" class="com.jiyu.entity.UserEntity">
     *    id: 方法名userEntity
     *    class：UserEntity
     * @return
     */
    @Bean
    public UserEntity userEntity() {
        return new UserEntity("jiyu", 10);
    }
}
