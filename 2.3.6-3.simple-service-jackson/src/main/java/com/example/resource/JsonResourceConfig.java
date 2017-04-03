package com.example.resource;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api/*")
public class JsonResourceConfig extends ResourceConfig {
    public JsonResourceConfig() {

        //3rd party packages
        register(JacksonFeature.class);
        register(JsonContextProvider.class);

        //this project classes
        register(BookResource.class);
    }
}
