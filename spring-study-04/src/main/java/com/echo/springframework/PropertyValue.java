package com.echo.springframework;

/**
 * <p>Title: PropertyValue</p>
 * <p>Description: 属性值类</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/22</p>
 *
 * @author lvdong
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
