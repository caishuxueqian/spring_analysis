package com.jiyu.v3;

import com.jiyu.v3.config.MyConfig;
import com.jiyu.v3.entity.Win10Entity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class V3SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Win10Entity win10Entity = (Win10Entity) annotationConfigApplicationContext.getBean("com.jiyu.v3.entity.Win10Entity");
        System.out.println(win10Entity);

    }
}
