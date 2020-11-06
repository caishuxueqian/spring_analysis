package com.jiyu.v3.config;

import com.jiyu.v3.entity.SMSEntity;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author jiyu
 * @date 2020/11/06 15:56
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param annotationMetadata 注解的信息
     * @param beanDefinitionRegistry
     */
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        //手动注册bean到springIOC容器中
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(SMSEntity.class);
        beanDefinitionRegistry.registerBeanDefinition("smsEntity",rootBeanDefinition);


    }
}

