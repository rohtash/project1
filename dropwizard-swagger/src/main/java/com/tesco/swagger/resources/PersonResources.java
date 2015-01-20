package com.tesco.swagger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tesco.swagger.data.PersonData;
import com.tesco.swagger.data.PetData;
import com.tesco.swagger.exception.NotFoundException;
import com.tesco.swagger.model.Person;
import com.tesco.swagger.model.Pet;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
@Path("/person")
@Api(value = "/person", description = "Operations about persons")
@Produces({"application/json"})
public class PersonResources {
	static PersonData personData = new PersonData();
	static JavaRestResourceUtil ru = new JavaRestResourceUtil();

	@GET
	@Path("/{personEmailId}")
	@ApiOperation(
		value = "Find person by ID", 
		notes = "Returns a person when it provide correct emailId simulate API error conditions", 
		response = Person.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "person not found") ,
			@ApiResponse(code = 500, message = "internal server Error")})
	public Response getPersonByEmailID(
			@ApiParam(value = "ID of person that needs to be fetched", required = true) @QueryParam("emailId")String emailId)
			throws NotFoundException {
		System.out.println(emailId+" my email id");
		
		Person person = personData.getPersonbyEmailId(emailId);
		if (null != person) {
			return Response.ok().entity(person).build();
		} else {
			throw new NotFoundException(404, "person not found");
		}
	}

	@POST
	@ApiOperation(value = "Add a new person to the store")
	@ApiResponses(value = { @ApiResponse(code = 405, message = "Invalid input") })
	public Response addPerson(
			@ApiParam(value = "Person object that needs to be added to the store", required = true) Person person) {
		personData.addPerson(person);
		return Response.ok().entity("SUCCESS").build();
	}

	@PUT
	@ApiOperation(value = "Update an existing person")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "person not found"),
			@ApiResponse(code = 405, message = "Validation exception") })
	public Response updatePerson(
			@ApiParam(value = "Person object that needs to be added to the store", required = true) Person person) {
		personData.addPerson(person);
		return Response.ok().entity("SUCCESS").build();
	}

	
}