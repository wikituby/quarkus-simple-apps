package org.acme.openapi.swaggerui.Controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;

@Path("/vatCalculator")
public class VatController {

    @Inject
    VatService vatService;

    //VatService vatService = new VatService();

    @GET
    @Path("/netAmount")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateNetAmount(@QueryParam("grossAmount") double grossAmount) {
        return vatService.calculateNetAmount(grossAmount);
    }

    @GET
    @Path("/grossAmount")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateGrossAmount(@QueryParam("vat") double vat) {
        return vatService.calculateGrossAmount(vat);
    }

    @GET
    @Path("/Rate")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateRate(@QueryParam("grossAmount") double grossAmount, @QueryParam("netAmount") double netAmount) {
        return vatService.calculateRate(grossAmount, netAmount);
    }

    @GET
    @Path("/Vat")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateVat(@QueryParam("grossAmount") double grossAmount, @QueryParam("netAmount") double netAmount) {
        return vatService.calculateVat(grossAmount, netAmount);
    }
}
