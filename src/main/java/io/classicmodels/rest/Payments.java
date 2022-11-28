package io.classicmodels.rest;

import io.classicmodels.entity.Order;
import io.classicmodels.entity.Payment;
import io.classicmodels.service.PaymentService;
import io.classicmodels.utils.ResponseWrapper;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/payments")
public class Payments {
    @EJB
    private PaymentService paymentService;

    @GET
    public Response getAllPayments() {
        return Response.status(Response.Status.OK).entity(paymentService.getAllPayments()).build();
    }

    @GET
    @Path("/{checkNumber}")
    public Response getPayment(@PathParam("checkNumber") String checkNumber) {
        return Response.status(Response.Status.OK).entity(paymentService.getPayment(checkNumber)).build();
    }

    @POST
    public Response createPayment(@Valid Payment payment) {

        paymentService.createPayment(payment);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @PUT
    public Response updatePayment(@Valid Payment payment) {
        paymentService.updatePayment(payment);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }

    @DELETE
    @Path("/{checkNumber}")
    public Response deletePayment(@PathParam("checkNumber") String checkNumber) {
        paymentService.deletePayment(checkNumber);
        return Response.status(Response.Status.OK).entity(new ResponseWrapper()).build();
    }
}
