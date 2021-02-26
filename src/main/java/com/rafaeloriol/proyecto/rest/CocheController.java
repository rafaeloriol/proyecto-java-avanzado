package com.rafaeloriol.proyecto.rest;

import com.rafaeloriol.proyecto.domain.FactoryCoche;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cars")
@Component
//@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CocheController {


    @GET
    @Path("{tipo}")
    public Response cearCoche(@PathParam("tipo") String tipo) throws Exception {

        return Response.ok(FactoryCoche.crearCoche(tipo)).build();
    }


}
