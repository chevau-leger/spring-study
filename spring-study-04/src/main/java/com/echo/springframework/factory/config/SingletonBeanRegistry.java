package com.echo.springframework.factory.config;

/**
 * <p>Title: SingletonBeanRegistry</p>
 * <p>Description: 单例注册接口</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/21</p>
 *
 * @author lvdong
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
