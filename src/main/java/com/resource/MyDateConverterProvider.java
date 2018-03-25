package com.resource;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Calendar;

/**
 * Created by animjain on 3/25/18.
 */
@Provider
public class MyDateConverterProvider implements ParamConverterProvider {
    @Override
    public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
        /*
         * rawType : Type of the instance that needs conversion from String to
         * genericType
         * annotations : list of annotations sent in request are mapped here
         */

        if(rawType.getName().equals(MyDate.class.getName())){
            return new ParamConverter<T>() {
                @Override
                public T fromString(String value) {
                    Calendar requestedDate = Calendar.getInstance();
                    if(value.equalsIgnoreCase("tomorrow")){
                        requestedDate.add(Calendar.DATE, 1);
                    }
                    else if(value.equalsIgnoreCase("yesterday")){
                        requestedDate.add(Calendar.DATE, -1);
                    }
                    MyDate myDate = new MyDate();
                    myDate.setDate(requestedDate.get(Calendar.DATE));
                    myDate.setMonth(requestedDate.get(Calendar.MONTH));
                    myDate.setYear(requestedDate.get(Calendar.YEAR));

                    return rawType.cast(myDate);        // myDate is a generic type so that it returns the instance it requires..
                }

                @Override
                public String toString(T myBean) {
                    if(myBean == null)
                        return null;
                    return myBean.toString();
                }
            };
        }
        return null;
    }
}
