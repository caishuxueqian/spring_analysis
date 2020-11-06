package com.jiyu.v3.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {

    /**
     *
     * @param conditionContext 获取当前的上下文
     * @param annotatedTypeMetadata 获取当前注解的信息
     * @return
     */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //1、获取当前的环境
        Environment environment = conditionContext.getEnvironment();
       //os.name： Spring封装好的，表示当前的环境
        String osName = environment.getProperty("os.name");
        if ("Windows 10".equals(osName)){
            //可以注册该对象
            return true;
        }
        //不能注册该对象
        return false;
    }
}
