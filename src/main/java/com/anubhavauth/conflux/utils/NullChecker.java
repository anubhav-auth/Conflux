package com.anubhavauth.conflux.utils;

import java.lang.reflect.Field;

public class NullChecker{
    public boolean hasNullField() {

        for (Field field : this.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                if (field.get(this) == null) {
                    return true; // Found a null field
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
