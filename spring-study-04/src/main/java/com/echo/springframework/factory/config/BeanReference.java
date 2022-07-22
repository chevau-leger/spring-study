package com.echo.springframework.factory.config;

/**
 * <p>Title: BeanReference</p>
 * <p>Description: 类引用</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/22</p>
 *
 * @author lvdong
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
