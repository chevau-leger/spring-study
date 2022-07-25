package com.echo.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: UserDao</p>
 * <p>Description: UserDao bean</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/22</p>
 *
 * @author lvdong
 */
public class UserDao {

    private static Map<String, String> users = new HashMap<>();

    static {

        users.put("10001", "jack");
        users.put("10002", "rose");
        users.put("10003", "tom");
    }

    public String queryById(String id) {

        return users.get(id);
    }
}
