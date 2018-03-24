package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by animjain on 3/24/18.
 */

/*
Instance is created everytime when a request is made to this instance. This is the default behaviour.
Otw, you can specify singleton resources which will be instanatiated once only. Check TestSingletonClass for more info
 */
@Path("/hello")
public class HelloResource {

    private int count;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){
        count = count+1;
        return "Your app is working now again... Count value = "+count;             // returns 1 as it is not a singleton
    }
}
