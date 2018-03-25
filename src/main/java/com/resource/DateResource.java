package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by animjain on 3/25/18.
 */
@Path("/date/{dateString}")
public class DateResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String convertDate(@PathParam("dateString") MyDate myDate){      // Jersey will do this conversion
        /*
        Using:

         * ParamConverterProvider
         * ParamConverter : Interface with methods to custum Data Type
         *
         */

        return "Got :"+myDate.toString();
    }
}
