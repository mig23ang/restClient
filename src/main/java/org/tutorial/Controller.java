package org.tutorial;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.tutorial.consumidores.Consumidor;

@Path("/api")
public class Controller {

    @RestClient
    Consumidor consumidor;

    @GET
    @Path("/goku")
    public String goku() {
        return consumidor.obtenerDataGoku();
    }

    @GET
    @Path("/bulma")
    public String bulma() {
        return consumidor.obtenerDataBulma();
    }
}
