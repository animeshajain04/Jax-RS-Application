package com.resource;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;

/**
 * Created by animjain on 3/25/18.
 */

/*
* Can not be singleton as singleton resource gets created before injections...hence as the resource are not avail, can not create them....
 */

@Path("{pathParamName}/test")
public class PathQueryParamExample {
    @PathParam("pathParamName") private String pathParamExample;
    @QueryParam("queryName")    private String queryParamExample;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test(){
        return "Path Param passed = "+pathParamExample+"    Query Param : "+queryParamExample;
    }

}

/*
http://localhost:8080/Jax_RS_Application_war_exploded/app/conenctor/test?queryName=getName

Path Param passed = conenctor    Query Param : getName
 */