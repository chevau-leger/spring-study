package com.echo.springframework.factory.support;

import com.echo.springframework.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: DefaultSingletonBeanRegistry</p>
 * <p>Description: SingletonBeanRegistry实现类</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/21</p>
 *
 * @author lvdong
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {

        return singletonObjects.get(beanName);
    }

    public void addSingleton(String beanName, Object singletonObject) {

        singletonObjects.put(beanName, singletonObject);
    }
}
