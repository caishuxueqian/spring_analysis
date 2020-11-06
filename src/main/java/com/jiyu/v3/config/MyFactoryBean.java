package com.jiyu.v3.config;

import com.jiyu.v3.entity.MyEntity;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author jiyu
 * @date 2020/11/06 16:16
 */
public class MyFactoryBean implements FactoryBean <MyEntity>{

    public MyEntity getObject() throws Exception {
        return new MyEntity();
    }

    public Class<?> getObjectType() {
        return MyEntity.class;
    }

    public boolean isSingleton() {
        //默认的情况下就是为true
        return true;
    }
}
