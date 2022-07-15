package com.echo.springframework.test;

import com.echo.springframework.BeanDefinition;
import com.echo.springframework.BeanFactory;
import com.echo.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * <p>Title: ApiTest</p>
 * <p>Description: bean测试类</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/15
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {

        //1.初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.query();
    }
}
