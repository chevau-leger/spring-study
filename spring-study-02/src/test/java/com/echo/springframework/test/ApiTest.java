package com.echo.springframework.test;

import com.echo.springframework.beans.factory.config.BeanDefinition;
import com.echo.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.echo.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * <p>Title: ApiTest</p>
 * <p>Description: bean测试类</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/18
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {

        //1.初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //3.第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.query();
        //4.第二次获取bean from singleton
        UserService userServiceSingleton = (UserService) beanFactory.getBean("userService");
        userServiceSingleton.query();
    }
}
