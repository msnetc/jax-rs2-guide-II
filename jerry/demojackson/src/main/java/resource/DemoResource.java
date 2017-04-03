package resource;

import org.apache.log4j.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jerry on 2017/4/3.
 */

@Path("hi")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DemoResource {


    @GET
    public List<String> hi(){
        List<String> result = new ArrayList<>();
        result.add("jerry");
        result.add("tom");
        return  result;
    }

}
