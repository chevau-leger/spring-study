package com.echo.springframework.factory;

import com.echo.springframework.BeansException;

/**
 * <p>Title: BeanFactory</p>
 * <p>Description: bean工厂</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/21</p>
 *
 * @author lvdong
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    Object getBean(String beanName, Object... args) throws BeansException;
}
