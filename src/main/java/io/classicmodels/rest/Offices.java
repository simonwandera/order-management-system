package io.classicmodels.rest;

import io.classicmodels.entity.Employee;
import io.classicmodels.entity.Office;
import io.classicmodels.service.EmployeeService;
import io.classicmodels.service.OfficeService;
import io.classicmodels.utils.ResponseWrapper;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/offices")
public class Offices {

    @EJB
    private OfficeService officeService;

    @GET
    public Response getAllOffices() {
        return Response.status(Response.Status.OK).entity(officeService.getAllOffices()).build();
    }

    @GET
    @Path("/{officeCode}")
    public Response getOffice(@PathParam("officeCode") String officeCode) {
        return Response.status(Response.Status.OK).entity(officeService.getOffice(officeCode)).build();
    }

    @POST
    public Response createOffice(@Valid Office office) {

        officeService.createOffice(office);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @PUT
    public Response updateOffice(@Valid Office office) {
        officeService.createOffice(office);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @DELETE
    @Path("/{officeCode}")
    public Response deleteOffice(@PathParam("officeCode") String officeCode) {
        officeService.deleteOffice(officeCode);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }
}
