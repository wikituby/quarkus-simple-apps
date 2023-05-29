package simplequarkusapps.vatcalculator.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import simplequarkusapps.vatcalculator.services.VatService;


@Path("/vat-calculator")
@Tag(name = "VAT  - Calculator", description = "calculating vat")
public class VatController {

    @Inject
    VatService vatService;

    @GET
    @Path("/vat")
    @Operation(summary = "calculate vat on goods and services", description = "calculate vat on goods and services.")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateVat(@QueryParam("grossAmount") double grossAmount) {
        return vatService.calculateVat(grossAmount);
    }

    @GET
    @Path("/net-amount")
    @Operation(summary = "calculates the net amount after vat deductions", description = "calculates the net amount after vat deductions.")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateNetAmount(@QueryParam("grossAmount") double grossAmount) {
        return vatService.calculateNetAmount(grossAmount);
    }

    @GET
    @Path("/gross-amount")
    @Operation(summary = "calculates the total amount of the vat and the net amount", description = "calculates the total amount of the vat and the net amount.")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateGrossAmount(@QueryParam("vat") double vat) {
        return vatService.calculateGrossAmount(vat);
    }

    @GET
    @Path("/rate")
    @Operation(summary = "calculates the vat rate deduction on the prices of goods", description = "calculates the vat rate deduction on the prices of goods.")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateRate(@QueryParam("grossAmount") double grossAmount, @QueryParam("vat") double vat) {
        return vatService.calculateRate(grossAmount, vat);
    }


}
