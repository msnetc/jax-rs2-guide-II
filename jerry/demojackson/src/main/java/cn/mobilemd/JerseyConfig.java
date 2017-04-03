package cn.mobilemd;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import resource.BookResource;
import resource.DemoResource;

/**
 * Created by jerry on 2017/4/3.
 */

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(JacksonFeature.class);
        //注册了ContextResolver的实现类JsonContextProvider，用于提供JSON数据的上下文，
        register(JsonContextProvider.class);

        registeResource();
    }

    private void registeResource(){
        register(BookResource.class);
        register(DemoResource.class);
    }
}
