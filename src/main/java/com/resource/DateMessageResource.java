package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by animjain on 3/25/18.
 */
@Path("/dateMessageBodyWriterTest")
public class DateMessageResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Date hello(){
        return Calendar.getInstance().getTime();
    }
}

// call as - http://localhost:8080/Jax_RS_Application_war_exploded/app/dateMessageBodyWriterTest
