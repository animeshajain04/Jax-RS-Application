package com.app;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Created by animjain on 3/24/18.
 */

@ApplicationPath("/app")
public class MyRestApp extends Application{
    /*
    * If getClasses() is not annotated, by default all classes in class path will be accessible to Jax-rs
    *
    * If we want to avoid some class exposed, we will overwrite and add only classes required by overridding methods
     */



}