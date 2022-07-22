package com.echo.springframework.factory.support;

import com.echo.springframework.BeansException;
import com.echo.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <p>Title: SimpleInstantiationStrategy</p>
 * <p>Description: Constructor InstantiationStrategy实现类</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/21</p>
 *
 * @author lvdong
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args)
            throws BeansException {

        Class beanClass = beanDefinition.getBeanClass();
        try {

            if (ctor != null) {

                return beanClass.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            } else {

                return beanClass.getDeclaredConstructor().newInstance();
            }

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {

            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }
    }
}
