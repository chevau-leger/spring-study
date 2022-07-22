package com.echo.springframework.factory.support;

import com.echo.springframework.BeansException;
import com.echo.springframework.factory.config.BeanDefinition;

/**
 * <p>Title: BeanDefinitionRegistry</p>
 * <p>Description: BeanDefinition注册</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/21</p>
 *
 * @author lvdong
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
