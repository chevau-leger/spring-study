package com.echo.springframework.beans.factory.support;

import com.echo.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: DefaultSingletonBeanRegistry</p>
 * <p>Description: SingletonBeanRegistry实现类</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/18
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {

        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {

        singletonObjects.put(beanName, singletonObject);
    }
}
