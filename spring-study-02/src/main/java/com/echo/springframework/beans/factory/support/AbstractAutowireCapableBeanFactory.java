package com.echo.springframework.beans.factory.support;

import com.echo.springframework.beans.BeansException;
import com.echo.springframework.beans.factory.config.BeanDefinition;

/**
 * <p>Title: AbstractAutowireCapableBeanFactory</p>
 * <p>Description: 实例化Bean类</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/18
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {

        Object bean = null;
        try {

            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {

            throw new BeansException("instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
