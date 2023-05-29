package simplequarkusapps.nssfcalculator.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import simplequarkusapps.nssfcalculator.services.NssfService;


@Path("/nssf-calculator")
@Tag(name = "NSSF  - Calculator", description = "Fetch dashboard card data")
public class NssfController {

    @Inject
    NssfService nssfService;

    @GET
    @Path("/nssf-rates-and-Info")
    @Operation(summary = "shows all the detailed info about NSSF Contributions", description = "This endpoint gives all the detailed info about NSSF Contributions.")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateRatesAndInfo() {
        return nssfService.calculateRatesAndInfo();
    }

    @GET
    @Path("/nssf-contributions")
    @Operation(summary = "This calculates nssf contributions for employee and employer", description = "This calculates nssf contributions for employee and employer and the total nssf contribution")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateNssfContribution(@QueryParam("grossPay") double grossPay) {
        return nssfService.calculateNssfContribution(grossPay);
    }

    @GET
    @Path("/employee-grossPay")
    @Operation(summary = "This calculates employees grossPay", description = "This calculates employees grossPay.")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateGrossPay(@QueryParam("employerNssfContribution") double employerNssfContribution) {
        return nssfService.calculateGrossPay(employerNssfContribution);
    }

    @GET
    @Path("/employee-netPay")
    @Operation(summary = "This calculates employees netPay after nssf deduction", description = "This calculates employees netPay after nssf deduction.")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateNetPay(@QueryParam("grossPay") double grossPay) {
        return nssfService.calculateNetPay(grossPay);
    }

}
