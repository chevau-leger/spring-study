package com.echo.springframework.beans.factory.config;

/**
 * <p>Title: SingletonBeanRegistry</p>
 * <p>Description: 单例注册接口</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/18
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
