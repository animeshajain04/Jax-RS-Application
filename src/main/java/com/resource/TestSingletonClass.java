package com.resource;


import com.sun.jersey.spi.resource.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by animjain on 3/25/18.
 */
/*
  Singleton gets created before the request is created...
 */

@Path("/singleton")
@Singleton
public class TestSingletonClass {
    private int count;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test(){
        count+=1;
        return "Count value="+count;
    }
}
