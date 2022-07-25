package com.echo.springframework.test;

import com.echo.springframework.PropertyValue;
import com.echo.springframework.PropertyValues;
import com.echo.springframework.factory.config.BeanDefinition;
import com.echo.springframework.factory.config.BeanReference;
import com.echo.springframework.factory.support.DefaultListableBeanFactory;
import com.echo.springframework.test.bean.UserDao;
import com.echo.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * <p>Title: ApiTest</p>
 * <p>Description: bean测试类</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/21</p>
 *
 * @author lvdong
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {

        //1.初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.注册 UserDao bean
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        //3.UserService设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("id", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));
        //2.注册 UserService bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //3.获取 UserService bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.query();
    }
}
