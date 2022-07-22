package com.echo.springframework;

/**
 * <p>Title: BeansException</p>
 * <p>Description: bean异常</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/21</p>
 *
 * @author lvdong
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {

        super(msg);
    }

    public BeansException(String msg, Throwable cause) {

        super(msg, cause);
    }
}
