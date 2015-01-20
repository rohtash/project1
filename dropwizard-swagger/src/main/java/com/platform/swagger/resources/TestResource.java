
package com.platform.swagger.resources;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/test.json")
@Api(value = "/test", description = "dummy response !")
public class TestResource {

    @GET
    @ApiOperation(value = "Say Hello World",notes = "Anything Else?")
	@ApiResponses(value = {
	@ApiResponse(code = 200, message = "OK"),
	@ApiResponse(code = 500, message = "Something wrong in Server")})
    public Response dummyEndpoint() {
        return Response.ok().build();
    }
}
