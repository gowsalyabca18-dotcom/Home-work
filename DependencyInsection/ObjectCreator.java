package com.example.Dependency;

import java.lang.reflect.Field;


public class ObjectCreator
 {
    public static void injection(Object obj) throws Exception 
    {
        Field[] fields=obj.getClass().getDeclaredFields();

        for(Field fls:fields)
        {
            if(fls.isAnnotationPresent(inject.class))
            {
                Object dio=fls.getType().getDeclaredConstructor().newInstance();
                fls.setAccessible(true);
                fls.set(obj, dio);
            }
        }
    }
}
