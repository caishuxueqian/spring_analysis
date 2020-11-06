package com.jiyu.v3;

import com.jiyu.v3.config.MyConfig;
import com.jiyu.v3.entity.MyEntity;
import com.jiyu.v3.entity.Win10Entity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class V3SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Win10Entity win10Entity = (Win10Entity) annotationConfigApplicationContext.getBean("com.jiyu.v3.entity.Win10Entity");
        System.out.println(win10Entity);

        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (int i = 0; i <beanDefinitionNames.length ; i++) {
            System.out.println(beanDefinitionNames[i]);
        }

        MyEntity myEntity1 = (MyEntity) annotationConfigApplicationContext.getBean("myFactoryBean");
        MyEntity myEntity2 = (MyEntity) annotationConfigApplicationContext.getBean("myFactoryBean");
        System.out.println(myEntity1 == myEntity2);
    }
}
