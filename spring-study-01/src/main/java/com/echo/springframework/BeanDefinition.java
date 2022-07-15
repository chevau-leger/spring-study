package com.echo.springframework;

/**
 * <p>Title: BeanDefinition</p>
 * <p>Description: bean定义类</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/15
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {

        this.bean = bean;
    }

    public Object getBean() {

        return bean;
    }
}
