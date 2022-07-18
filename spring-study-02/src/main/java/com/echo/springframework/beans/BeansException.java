package com.echo.springframework.beans;

/**
 * <p>Title: BeansException</p>
 * <p>Description: bean异常</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/18
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {

        super(msg);
    }

    public BeansException(String msg, Throwable cause) {

        super(msg, cause);
    }
}
