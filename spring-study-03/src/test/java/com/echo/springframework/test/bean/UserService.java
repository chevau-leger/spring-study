package com.echo.springframework.test.bean;

/**
 * <p>Title: UserService</p>
 * <p>Description: UserService bean</p>
 * <p>Company: SI-TECH</p>
 *
 * @author lvdong
 * @version 1.0
 * @since 2022/7/18
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void query() {

        System.out.println("查询用户信息: " + name);
    }

    @Override
    public String toString() {

        return name;
    }
}
