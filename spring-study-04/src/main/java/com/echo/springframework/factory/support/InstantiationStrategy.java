package com.echo.springframework.factory.support;

import com.echo.springframework.factory.config.BeanDefinition;
import com.echo.springframework.BeansException;

import java.lang.reflect.Constructor;

/**
 * <p>Title: InstantiationStrategy</p>
 * <p>Description: 实例化策略</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/21</p>
 *
 * @author lvdong
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
