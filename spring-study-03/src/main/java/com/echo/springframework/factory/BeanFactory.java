package com.echo.springframework.factory;

import com.echo.springframework.BeansException;

/**
 * <p>Title: BeanFactory</p>
 * <p>Description: bean工厂</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/19
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    Object getBean(String beanName, Object... args) throws BeansException;
}
