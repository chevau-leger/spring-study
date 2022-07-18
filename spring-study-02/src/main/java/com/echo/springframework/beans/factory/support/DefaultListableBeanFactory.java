package com.echo.springframework.beans.factory.support;

import com.echo.springframework.beans.BeansException;
import com.echo.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: DefaultListableBeanFactory</p>
 * <p>Description: 核心实现类</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/18
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {

        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {

            throw new BeansException("no bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeansException {

        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
