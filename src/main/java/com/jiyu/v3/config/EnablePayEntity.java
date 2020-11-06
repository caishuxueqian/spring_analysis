package com.jiyu.v3.config;

import com.jiyu.v3.entity.PayEntity;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author jiyu
 * @date 2020/11/06 14:42
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(PayEntity.class)
public @interface  EnablePayEntity {
    //只要启动的时候，加入该@EnablePayEntity注解 就会将PayEntity实体类注入到springIOC容器
}
