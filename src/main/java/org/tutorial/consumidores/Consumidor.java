package org.tutorial.consumidores;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "miConsumidor")
@Consumes(MediaType.TEXT_PLAIN)
public interface Consumidor {

    @GET
    @Path("/1")
    public String obtenerDataGoku();

    @GET
    @Path("/4")
    public String obtenerDataBulma();
}
