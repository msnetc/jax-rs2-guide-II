//package cn.mobilemd;
//
//import cn.mobilemd.dtomodel.BookDto;
//import org.apache.log4j.Logger;
//import org.glassfish.jersey.client.ClientConfig;
//import org.glassfish.jersey.jackson.JacksonFeature;
//import org.glassfish.jersey.server.ResourceConfig;
//import org.glassfish.jersey.test.JerseyTest;
//import org.glassfish.jersey.test.TestProperties;
//import org.glassfish.jersey.test.util.runner.ConcurrentRunner;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import resource.BookResource;
//
//import javax.ws.rs.client.Entity;
//import javax.ws.rs.core.MediaType;
//import java.awt.print.Book;
//
///**
// * Created by jerry on 2017/4/3.
// */
//  //# TODO 1.单元测试尚未完成，即不知道如何完成单元测试中的调试
// //# TODO  2 debug! debug ! debug!
//@RunWith(ConcurrentRunner.class)
//public class BookResourceTest  extends JerseyTest {
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
//    private static final Logger LOGGER = Logger.getLogger(BookResourceTest.class);
//
//
//    @Test
//    public void testGetBooks() {
//        BookDto books = target("books").path("book").request(MediaType.APPLICATION_JSON_TYPE).get(BookDto.class);
//        LOGGER.debug(books);
//    }
//
//    @Test
//    public void testPost() {
//        Entity<BookDto> e = Entity.entity(new BookDto("Java Restful Web Services实战II", "机械工业出版社"), MediaType.APPLICATION_JSON_TYPE);
//        Book book = target("books").request(MediaType.APPLICATION_JSON_TYPE).post(e, Book.class);
//        LOGGER.debug(book);
//    }
//}
