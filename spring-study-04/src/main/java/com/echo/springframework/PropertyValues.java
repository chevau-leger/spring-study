package com.echo.springframework;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: PropertyValues</p>
 * <p>Description: 属性集合类</p>
 * <p>Company: SI-TECH</p>
 * <p>Date: 2022/7/22</p>
 *
 * @author lvdong
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValues = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {

        propertyValues.add(propertyValue);
    }

    public PropertyValue[] getPropertyValues() {

        return propertyValues.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValues(String propertyName) {

        for (PropertyValue propertyValue : propertyValues) {

            if (propertyValue.getName().equals(propertyName)) {

                return propertyValue;
            }
        }
        return null;
    }
}
