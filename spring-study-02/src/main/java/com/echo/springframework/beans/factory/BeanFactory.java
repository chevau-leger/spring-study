package com.echo.springframework.beans.factory;

/**
 * <p>Title: BeanFactory</p>
 * <p>Description: bean工厂</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/18
 */
public interface BeanFactory {

    Object getBean(String beanName);
}
