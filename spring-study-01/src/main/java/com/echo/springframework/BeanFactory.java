package com.echo.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>Title: BeanFactory</p>
 * <p>Description: bean工厂</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/15
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {

        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {

        beanDefinitionMap.put(name, beanDefinition);
    }
}
