//package cn.mobilemd;
//
//import org.glassfish.jersey.client.ClientConfig;
//import org.glassfish.jersey.jackson.JacksonFeature;
//import org.glassfish.jersey.server.ResourceConfig;
//import org.glassfish.jersey.test.JerseyTest;
//import org.glassfish.jersey.test.TestProperties;
//import org.glassfish.jersey.test.util.runner.ConcurrentRunner;
//import org.junit.runner.RunWith;
//import resource.BookResource;
//
///**
// * Created by jerry on 2017/4/3.
// */
//@RunWith(ConcurrentRunner.class)
//public class JerseyResourceTest extends JerseyTest {
//
//
//    @Override
//    protected ResourceConfig configure() {
//        enable(TestProperties.LOG_TRAFFIC);
//        enable(TestProperties.DUMP_ENTITY);
//        return resourceConfig();
//    }
//
//    private ResourceConfig resourceConfig(){
//        ResourceConfig resourceConfig = new ResourceConfig(BookResource.class);
//        resourceConfig.register(JacksonFeature.class).register(JsonContextProvider.class);
//        return resourceConfig;
//    }
//
//    @Override
//    protected void configureClient(ClientConfig config) {
//        config.register(new JacksonFeature()).register(JsonContextProvider.class);
//    }
//}
