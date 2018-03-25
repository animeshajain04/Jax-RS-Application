package com.resource;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by animjain on 3/25/18.
 */
@Provider
@Produces("text/shortdate")             // we can have seperate writers for all the mediatypes produces by actual resource...
    // Jersey uses this method to determine if it can write the type passed...
public class ShortDateMessageBodyWriter implements MessageBodyWriter<Date>  {
    @Override
    public boolean isWriteable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return Date.class.isAssignableFrom(aClass);
    }

    @Override
    public long getSize(Date date, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return 0;
    }

    //writeTo method is called if isWritable returns True by Jersey....
    @Override
    public void writeTo(Date date,
                        Class<?> aClass,
                        Type type,
                        Annotation[] annotations,
                        MediaType mediaType,
                        MultivaluedMap<String, Object> multivaluedMap,
                        OutputStream outputStream)
            throws IOException, WebApplicationException {

        String shortDate = date.getDate() + " - "+ date.getMonth();
        outputStream.write(shortDate.getBytes());
    }
}

