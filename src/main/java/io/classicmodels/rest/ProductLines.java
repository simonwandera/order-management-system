package io.classicmodels.rest;

import io.classicmodels.entity.ProductLine;
import io.classicmodels.service.ProductLineService;
import io.classicmodels.utils.ResponseWrapper;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("productLines")
public class ProductLines {

    @EJB
    private ProductLineService productLineService;

    @GET
    public Response getAllProductLines() {
        return Response.status(Response.Status.OK).entity(productLineService.getAllProductLines()).build();
    }

    @GET
    @Path("/{id}")
    public Response getProductLine(@PathParam("id") String id) {
        return Response.status(Response.Status.OK).entity(productLineService.getProductLine(id)).build();
    }

    @POST
    public Response createProductLine(@Valid ProductLine productLine) {

        productLineService.createProductLine(productLine);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @PUT
    public Response updateProductLine(@Valid ProductLine productLine) {
        productLineService.updateProductLine(productLine);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteProductLine(@PathParam("id") String id) {
        productLineService.deleteProductLine(id);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

}
