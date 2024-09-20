package com.fernando;

import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    Imprimir imprimir;
    @Inject
    Instance<Service> service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        imprimir.imprimir("teste");
        return "saida";
    }

    @GET
    @Path("/oi")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        return service.get().ping();
    }
}
