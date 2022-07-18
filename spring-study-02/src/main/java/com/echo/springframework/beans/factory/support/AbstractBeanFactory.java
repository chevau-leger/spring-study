package com.echo.springframework.beans.factory.support;

import com.echo.springframework.beans.BeansException;
import com.echo.springframework.beans.factory.BeanFactory;
import com.echo.springframework.beans.factory.config.BeanDefinition;

/**
 * <p>Title: AbstractBeanFactory</p>
 * <p>Description: 抽象bean工厂</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/18
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {

        Object bean = getSingleton(beanName);
        if (bean != null) {

            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
