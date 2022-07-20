package com.echo.springframework.factory.support;

import com.echo.springframework.BeansException;
import com.echo.springframework.factory.config.BeanDefinition;

/**
 * <p>Title: BeanDefinitionRegistry</p>
 * <p>Description: BeanDefinition注册</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/18
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
