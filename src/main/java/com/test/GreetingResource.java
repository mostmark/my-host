package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        String hostname = System.getenv().getOrDefault("HOSTNAME", "HOSTNAME-NOT-DEFINED");
        String clusterName = System.getenv().getOrDefault("CLUSTERNAME", "CLUSTERNAME-NOT-DEFINED");
        return hostname + " at cluster " + clusterName;
    }
}