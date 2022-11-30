package io.classicmodels.rest;

import io.classicmodels.entity.OrderDetail;
import io.classicmodels.service.OrderDetailService;
import io.classicmodels.utils.ResponseWrapper;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/orderDetails")
public class OrderDetails {

    @EJB
    private OrderDetailService orderDetailService;

    @GET
    public Response getAllOrderDetails() {
        return Response.status(Response.Status.OK).entity(orderDetailService.getAllOrderDetails()).build();
    }

    @GET
    @Path("/{orderNumber}")
    public Response getOrder(@PathParam("orderNumber") Integer orderNumber) {
        return Response.status(Response.Status.OK).entity(orderDetailService.getOrderDetail(orderNumber)).build();
    }

    @GET
    @Path("/order/{orderNumber}")
    public Response getOrderDetailByOrder(@PathParam("orderNumber") Integer orderNumber) {
        return Response.status(Response.Status.OK).entity(orderDetailService.getOrderDetailsByOrder(orderNumber)).build();
    }

    @GET
    @Path("/product/{orderNumber}")
    public Response getOrderDetailByOrder(@PathParam("orderNumber") String checkNumber) {
        return Response.status(Response.Status.OK).entity(orderDetailService.getOrderDetailsByProduct(checkNumber)).build();
    }

    @POST
    public Response createOrderDetail(@Valid OrderDetail orderDetail) {

        orderDetailService.createOrderDetail(orderDetail);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @PUT
    public Response updateOrderDetail(@Valid OrderDetail orderDetail) {
        orderDetailService.updateOrderDetail(orderDetail);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @DELETE
    @Path("/{orderNumber}")
    public Response deleteOrder(@PathParam("orderNumber") Integer orderNumber) {
        orderDetailService.deleteOrderDetail(orderNumber);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }
}