package org.acme.openapi.swaggerui.vatcalculator.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.acme.openapi.swaggerui.vatcalculator.services.VatService;


@Path("/vatCalculator")
public class VatController {

    @Inject
    VatService vatService;

    @GET
    @Path("/netAmount")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateNetAmount(@QueryParam("clientGrossAmount") double clientGrossAmount) {
        return vatService.calculateNetAmount(clientGrossAmount);
    }

    @GET
    @Path("/grossAmount")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateGrossAmount(@QueryParam("clientVat") double clientVat) {
        return vatService.calculateGrossAmount(clientVat);
    }

    @GET
    @Path("/Rate")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateRate(@QueryParam("clientGrossAmount") double clientGrossAmount, @QueryParam("clientNetAmount") double clientNetAmount) {
        return vatService.calculateRate(clientGrossAmount, clientNetAmount);
    }

    @GET
    @Path("/Vat")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateVat(@QueryParam("clientGrossAmount") double clientGrossAmount, @QueryParam("clientNetAmount") double clientNetAmount) {
        return vatService.calculateVat(clientGrossAmount, clientNetAmount);
    }
}
