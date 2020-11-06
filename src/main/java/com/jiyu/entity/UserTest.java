package com.jiyu.entity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

   static ClassPathXmlApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserEntity userEntity = context.getBean("userEntity",UserEntity.class);

        System.out.println(userEntity);
    }
}
