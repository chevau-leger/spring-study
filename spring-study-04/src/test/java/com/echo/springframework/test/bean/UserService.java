package com.echo.springframework.test.bean;

/**
 * <p>Title: UserService</p>
 * <p>Description: UserService bean</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/21</p>
 *
 * @author lvdong
 */
public class UserService {

    private String name;

    public UserService() {
    }

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
