package com.echo.springframework.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.echo.springframework.BeansException;
import com.echo.springframework.PropertyValue;
import com.echo.springframework.PropertyValues;
import com.echo.springframework.factory.config.BeanDefinition;
import com.echo.springframework.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/**
 * <p>Title: AbstractAutowireCapableBeanFactory</p>
 * <p>Description: bean实例化类</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/21</p>
 *
 * @author lvdong
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubClassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {

        Object bean;
        try {

            bean = createBeanInstance(beanDefinition, beanName, args);
            //填充bean属性
            applyPropertyValues(beanName, bean, beanDefinition);
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

    private void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {

        try {

            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {

                String name = propertyValue.getName();
                Object value = propertyValue.getValue();
                if (value instanceof BeanReference) {

                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }
                BeanUtil.setFieldValue(bean, name, value);
            }
        } catch (Exception e) {

            throw new BeansException("Error setting property values：" + beanName);
        }
    }
}
