package com.jiyu.v4;

import com.jiyu.v4.config.MyConfig;
import com.jiyu.v4.ServiceImpl.OrderServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiyu
 * @date 2020/11/07 10:46
 */
public class V4Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) annotationConfigApplicationContext.getBean("orderServiceImpl");
        orderServiceImpl.add();
    }
}
