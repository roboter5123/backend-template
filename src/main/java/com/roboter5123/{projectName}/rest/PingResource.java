package at.dbeg.eos2.service.sandbox.campbookpascalgehringer.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.dbeg.eos2.service.sandbox.campbookpascalgehringer.rest.model.Ping;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@Api(tags = "Ping Resource")
@SwaggerDefinition(tags = {
        @Tag(name = "Ping Resource", description = "Used to test the availability of a service")
})
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/")
public class PingResource {

    private static final Logger log = LoggerFactory.getLogger(PingResource.class);

    @Path("/ping")
    @GET
    @ApiOperation(value = "Ping", response = Ping.class)
    @ApiResponses({@ApiResponse(code = 200, message = "Current time")})
    public Response ping() {
        log.info("ping");
        return Response.ok(new Ping()).build();
    }

}
