package com.echo.springframework.beans.factory.support;

import com.echo.springframework.beans.BeansException;
import com.echo.springframework.beans.factory.config.BeanDefinition;

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

    void registerBeanDefinition(String beanName,BeanDefinition beanDefinition) throws BeansException;
}
