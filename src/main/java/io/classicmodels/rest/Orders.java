package io.classicmodels.rest;

import io.classicmodels.entity.Order;
import io.classicmodels.service.OrderService;
import io.classicmodels.utils.ResponseWrapper;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/orders")
public class Orders {

    @EJB
    private OrderService orderService;

    @GET
    public Response getAllOrders() {
        return Response.status(Response.Status.OK).entity(orderService.getAllOrders()).build();
    }

    @GET
    @Path("/{orderNumber}")
    public Response getOrder(@PathParam("orderNumber") Integer orderNumber) {
        return Response.status(Response.Status.OK).entity(orderService.getOrder(orderNumber)).build();
    }

    @POST
    public Response createOrder(@Valid Order order) {

        orderService.createOrder(order);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @PUT
    public Response updateOrder(@Valid Order order) {
        orderService.updateOrder(order);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @DELETE
    @Path("/{orderNumber}")
    public Response deleteOrder(@PathParam("orderNumber") Integer orderNumber) {
        orderService.deleteOrder(orderNumber);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }
}
