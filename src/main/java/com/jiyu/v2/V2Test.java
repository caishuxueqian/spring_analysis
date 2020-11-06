package com.jiyu.v2;

import com.jiyu.entity.UserEntity;
import com.jiyu.v2.config.MySpringConfig;
import com.jiyu.v2.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiyu
 * @date 2020/11/05 16:11
 */
public class V2Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MySpringConfig.class);
        //UserEntity userEntity = annotationConfigApplicationContext.getBean("userEntity", UserEntity.class);
        //System.out.println(userEntity);
        UserService userService = annotationConfigApplicationContext.getBean("userService",UserService.class);
        System.out.println("userService:" + userService);
        String[] beans = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (int i = 0; i < beans.length; i++) {
            System.out.println(beans[i]);
        }
    }

}
