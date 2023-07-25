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


@SwaggerDefinition(tags = {
        @Tag(name = "Ping Resource", description = "Used to test the availability of a service")
})
@RestController
@RequestMapping("/ping")
public class PingResource {

    private static final Logger log = LoggerFactory.getLogger(PingResource.class);

    @GetMapping()
    @ApiOperation(value = "Ping", response = Ping.class)
    @ApiResponses({@ApiResponse(code = 200, message = "Current time")})
    public Ping ping() {
        log.info("ping");
        return new Ping().build();
    }

}