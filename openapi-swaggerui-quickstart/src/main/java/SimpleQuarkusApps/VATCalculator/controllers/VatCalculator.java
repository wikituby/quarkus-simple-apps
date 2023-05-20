package SimpleQuarkusApps.VATCalculator.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import SimpleQuarkusApps.VATCalculator.services.*;


@Path("/vatCalculator")
public class VatCalculator {

    @Inject
    VatService vatService;

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
