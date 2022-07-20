package com.echo.springframework.factory.support;

import com.echo.springframework.BeansException;
import com.echo.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * <p>Title: AbstractAutowireCapableBeanFactory</p>
 * <p>Description: bean实例化类</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/19
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubClassingInstantiationStrategy();

//    private InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {

        Object bean = null;
        try {

            bean = createBeanInstance(beanDefinition, beanName, args);
        } catch (Exception e) {

            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {

        Constructor constructor = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor<?> ctor : declaredConstructors) {

            if (args != null && ctor.getParameterTypes().length == args.length) {

                constructor = ctor;
                break;
            }
        }
        return instantiationStrategy.instantiate(beanDefinition, beanName, constructor, args);
    }
}
