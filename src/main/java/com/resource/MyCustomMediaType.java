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
@Path("/customMediaType")
public class MyCustomMediaType {
    @GET
    @Produces(value= {MediaType.TEXT_PLAIN, "text/shortdate"})
    // Depending upon the header set, it will call the respective producer implementation...
    public Date hello(){
        return Calendar.getInstance().getTime();
    }
}
