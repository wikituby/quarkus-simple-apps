package simplequarkusapps.loancalculator.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import simplequarkusapps.loancalculator.services.LoanService;

@Path("/loan-calculator")
@Tag(name = "Loan  - Calculator", description = "Fetch dashboard card data")
public class LoanController {

    @Inject
    LoanService loanService;

    @GET
    @Path("/interest")
    @Operation(summary = "calculate interest in a given period", description = "This will calculate interest in any time period given.")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterest(@QueryParam("principal") double principal, @QueryParam("ratePerMonth") double ratePerMonth, @QueryParam("Years") int years, @QueryParam("Months") int months, @QueryParam("Weeks") int weeks, @QueryParam("Days") int days) {
        return loanService.calculateInterest(principal, ratePerMonth, years, months, weeks,days);
    }
/*
    @GET
    @Path("/interest-per-day")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestPerDay(@QueryParam("principal") double principal, @QueryParam("ratePerMonth") double ratePerMonth) {
        return loanService1.calculateInterestPerDay(principal, ratePerMonth);
    }

    @GET
    @Path("/interest-per-week")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestPerWeek(@QueryParam("principal") double principal, @QueryParam("ratePerMonth") double ratePerMonth) {
        return loanService1.calculateInterestPerWeek(principal, ratePerMonth);
    }

    @GET
    @Path("/interest-per-year")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestPerYear(@QueryParam("principal") double principal, @QueryParam("clientRatePerMonth") double ratePerMonth) {
        return loanService1.calculateInterestPerYear(principal, ratePerMonth);
    }

    @GET
    @Path("/rate-per-month")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateRatePerMonth(@QueryParam("interestPerMonth") double interestPerMonth, @QueryParam("principal") double principal) {
        return loanService1.calculateRatePerMonth(interestPerMonth, principal);
    }

    @GET
    @Path("/principal")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculatePrincipal(@QueryParam("interestPerMonth") double interestPerMonth, @QueryParam("ratePerMonth") double ratePerMonth) {
        return loanService1.calculatePrincipal(interestPerMonth, ratePerMonth);
    }*/
}
