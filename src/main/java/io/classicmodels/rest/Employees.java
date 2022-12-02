package io.classicmodels.rest;

import io.classicmodels.entity.Employee;
import io.classicmodels.service.EmployeeService;
import io.classicmodels.utils.ResponseWrapper;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

@Path("/employees")
public class Employees {

    @EJB
    private EmployeeService employeeService;

    @GET
    public Response getAllEmployees() {
        return Response
                .status(Response.Status.OK)
                .entity(employeeService.getAllEmployees())
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .build();
    }

    @GET
    @Path("/{employeeNumber}")
    public Response getCustomer(@PathParam("employeeNumber") Integer employeeNumber) {
        return Response.status(Response.Status.OK).entity(employeeService.getEmployee(employeeNumber)).build();
    }

    @POST
    public Response createEmployee(@Valid Employee employee) {

        employeeService.createEmployee(employee);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();

    }

    @PUT
    public Response updateCustomer(@Valid Employee employee) {
        employeeService.createEmployee(employee);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @DELETE
    @Path("/{employeeNumber}")
    public Response deleteCustomer(@PathParam("employeeNumber") Integer employeeNumber) {
        employeeService.deleteEmployee(employeeNumber);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();

    }
}
