package com.echo.springframework.factory.support;

import com.echo.springframework.BeansException;
import com.echo.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * <p>Title: InstantiationStrategy</p>
 * <p>Description: 实例化策略</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/19
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
