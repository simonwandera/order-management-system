package io.classicmodels.rest;

import io.classicmodels.entity.Customer;
import io.classicmodels.service.CustomerService;
import io.classicmodels.utils.ResponseWrapper;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/customers")
public class Customers {
    @EJB
    private CustomerService customerService;

    @GET
    public Response getAllCustomers() {
        return Response.status(Response.Status.OK).entity(customerService.getAllCustomers()).build();
    }

    @GET
    @Path("/{customerNumber}")
    public Response getCustomer(@PathParam("customerNumber") Integer customerNumber) {
        return Response.status(Response.Status.OK).entity(customerService.getCustomer(customerNumber)).build();
    }

    @POST
    public Response createCustomer(@Valid Customer customer) {

        customerService.createCustomer(customer);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();

    }

    @PUT
    public Response updateCustomer(@Valid Customer customer) {
        customerService.createCustomer(customer);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @DELETE
    @Path("/{customerNumber}")
    public Response deleteCustomer(@PathParam("customerNumber") Integer customerNumber) {
        customerService.deleteCustomer(customerNumber);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();

    }

}
