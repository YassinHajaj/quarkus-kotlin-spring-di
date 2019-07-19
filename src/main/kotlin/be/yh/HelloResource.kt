package be.yh

import org.springframework.beans.factory.annotation.Autowired
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType.TEXT_PLAIN

@Path("/hello")
class HelloResource {

    @Autowired
    lateinit var helloService: HelloService

    @GET
    @Path("/latest")
    @Produces(TEXT_PLAIN)
    fun hello() = "Hello => " + helloService.getLatestEntry()

    @GET
    @Path("/all")
    @Produces(TEXT_PLAIN)
    fun all() = helloService.getAll()
}