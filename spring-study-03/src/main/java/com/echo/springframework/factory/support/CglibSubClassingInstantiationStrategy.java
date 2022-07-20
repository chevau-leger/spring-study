package com.echo.springframework.factory.support;

import com.echo.springframework.BeansException;
import com.echo.springframework.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * <p>Title: CglibSubClassingInstantiationStrategy</p>
 * <p>Description: Cglib InstantiationStrategy实现类</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/19
 */
public class CglibSubClassingInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args)
            throws BeansException {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (ctor == null) {

            return enhancer.create();
        }
        return enhancer.create(ctor.getParameterTypes(), args);
    }
}
