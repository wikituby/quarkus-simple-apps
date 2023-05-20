package SimpleQuarkusApps.NSSFCalculator.controllers;

import SimpleQuarkusApps.NSSFCalculator.services.NssfService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;


@Path("/nssfCalculator")
public class NssfCalculator {

    @Inject
    NssfService nssfService;

    @GET
    @Path("/NSSF Rates And Info")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateRatesAndInfo() {
        return nssfService.calculateRatesAndInfo();
    }

    @GET
    @Path("/Nssf Contributions")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateNssfContribution(@QueryParam("grossPay") double grossPay) {
        return nssfService.calculateNssfContribution(grossPay);
    }

    @GET
    @Path("/Employee grossPay")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateGrossPay(@QueryParam("employerNssfContribution") double employerNssfContribution) {
        return nssfService.calculateGrossPay(employerNssfContribution);
    }

    @GET
    @Path("/Employee NetPay")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateNetPay(@QueryParam("grossPay") double grossPay) {
        return nssfService.calculateNetPay(grossPay);
    }

}
