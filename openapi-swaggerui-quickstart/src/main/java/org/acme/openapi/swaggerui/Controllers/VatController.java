package org.acme.openapi.swaggerui.Controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.openapi.swaggerui.services.VatService;


@Path("/vatCalculator")
public class VatController {

    @Inject
    VatService vatService;

    //VatService vatService = new VatService();

    @GET
    @Path("/netAmount/{grossAmountFromClient}")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateNetAmount(@PathParam("grossAmountFromClient") double grossAmountFromClient) {
        return vatService.calculateNetAmount(grossAmountFromClient);
    }

    @GET
    @Path("/grossAmount/{clientVat}")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateGrossAmount(@PathParam("clientVat") double vat) {
        return vatService.calculateGrossAmount(vat);
    }

    @GET
    @Path("/Rate/{clientGrossAmount}/{clientNetAmount}")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateRate(@PathParam("clientGrossAmount") double grossAmount, @PathParam("clientNetAmount") double netAmount) {
        return vatService.calculateRate(grossAmount, netAmount);
    }

    @GET
    @Path("/Vat/{clientGrossAmount}/{clientNetAmount}")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateVat(@PathParam("clientGrossAmount") double grossAmount, @PathParam("clientNetAmount") double netAmount) {
        return vatService.calculateVat(grossAmount, netAmount);
    }
}
