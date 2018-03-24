package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by animjain on 3/24/18.
 */
@Path("/hello")
public class HelloResource {
    @GET
    @Produces("text/pain")
    public String hello(){
        return "Your app is working now...";
    }
}

