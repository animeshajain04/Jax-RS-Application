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
import java.util.Date;

/**
 * Created by animjain on 3/25/18.
 */
/*
 * When we will return a instance of Date, by default we will get MessageBodyWriter exceptions.
 *
 * So writing a custom MessageBodyWriter which will return the object of our type to user
 */

// <Date> represent that this will write the type of Date

@Provider
@Produces(MediaType.TEXT_PLAIN)             // we can have seperate writers for all the mediatypes produces by actual resource...
// check DateMessageResource for more details on what it produces and how @Produces is used for the same...
public class DateMessageBodyWriter implements MessageBodyWriter<Date> {
    // Jersey uses this method to determine if it can write the type passed...
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

        outputStream.write(date.toString().getBytes());
    }
}
