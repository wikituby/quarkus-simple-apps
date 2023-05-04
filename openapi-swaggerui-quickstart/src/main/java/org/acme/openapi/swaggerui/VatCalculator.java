package org.acme.openapi.swaggerui;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.QueryParam;


@Path("/VatCalculator")
public class VatCalculator {
// new cpmit
    @GET
    @Path("/NetAmount")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateNetAmount(@QueryParam("grossAmount") double grossAmount) {
        return VatService.calculateNetAmount(grossAmount);
    }

    @GET
    @Path("/GrossAmount")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateGrossAmount(@QueryParam("vat") double vat) {
        return VatService.calculateGrossAmount(vat);
    }

    @GET
    @Path("/Rate")
    @Produces(MediaType.TEXT_PLAIN)
    public String CalculateRate(@QueryParam("grossAmount") double grossAmount, @QueryParam("netAmount") double netAmount) {
        return VatService.calculateRate(grossAmount, netAmount);
    }


}
