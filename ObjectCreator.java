package com.example.demo;

import java.lang.reflect.Field;

public class ObjectCreator {
    public static void injector(Object obj) throws Exception
    {
        Field[] fields = obj.getClass().getDeclaredFields();

        for(Field fl:fields)
        {
            if(fl.isAnnotationPresent(myAnnotation.class))
            {
                fl.setAccessible(true);
                

                Class<?> fieldType=fl.getType();
                Object dio=fieldType.getDeclaredConstructor().newInstance();
                fl.set(obj,dio);
            }
        }

    }
}