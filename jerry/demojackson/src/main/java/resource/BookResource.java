package resource;

import cn.mobilemd.dtomodel.BookDto;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("books")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {
    private static final Logger LOGGER = Logger.getLogger(BookResource.class);

    @Path("/book")
    @GET
    public BookDto getBook() {
        final BookDto book = new BookDto();
        BookResource.LOGGER.debug(book);
        return book;
    }

    @POST
    public BookDto saveBook(final BookDto book) {
        BookResource.LOGGER.debug(book);
        return book;
    }
}
