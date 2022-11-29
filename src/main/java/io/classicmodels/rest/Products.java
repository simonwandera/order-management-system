package io.classicmodels.rest;

import io.classicmodels.entity.Product;
import io.classicmodels.entity.ProductLine;
import io.classicmodels.service.ProductService;
import io.classicmodels.utils.ResponseWrapper;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/products")
public class Products {

    @EJB
    private ProductService productService;

    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Response getAllProduct() {
        return Response.status(Response.Status.OK).entity(productService.getAllProducts()).build();
    }

    @GET
    @Path("/{productCode}")
    public Response getProduct(@PathParam("productCode") String productCode) {
        return Response.status(Response.Status.OK).entity(productService.getProduct(productCode)).build();
    }

    @POST
    public Response createProduct(@Valid Product product) {

        productService.createProduct(product);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @PUT
    public Response updateProduct(@Valid Product product) {
        productService.updateProduct(product);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @DELETE
    @Path("/{productCode}")
    public Response deleteProductLine(@PathParam("productCode") String productCode) {
        productService.deleteProduct(productCode);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }
}
