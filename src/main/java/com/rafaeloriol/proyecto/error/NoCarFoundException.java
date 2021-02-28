package com.rafaeloriol.proyecto.error;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class NoCarFoundException extends WebApplicationException {

    public NoCarFoundException(String message) {
        super(Response.status(Response.Status.UNAUTHORIZED)
                .entity(message).type(MediaType.APPLICATION_JSON).build());
    }
}
