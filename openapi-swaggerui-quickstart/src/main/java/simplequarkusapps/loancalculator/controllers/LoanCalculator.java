package simplequarkusapps.loancalculator.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import simplequarkusapps.loancalculator.services.LoanService;



@Path("/loan_calculator")
public class LoanCalculator {

    @Inject
    LoanService loanService;


    @GET
    @Path("/interest-per-month")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestPerMonth(@QueryParam("principal") double principal, @QueryParam("ratePerMonth") double ratePerMonth) {
        return loanService.calculateInterestPerMonth(principal, ratePerMonth);
    }

    @GET
    @Path("/interest_per_day")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestPerDay(@QueryParam("principal") double principal, @QueryParam("ratePerMonth") double ratePerMonth) {
        return loanService.calculateInterestPerDay(principal, ratePerMonth);
    }

    @GET
    @Path("/interest-per-week")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestPerWeek(@QueryParam("principal") double principal, @QueryParam("ratePerMonth") double ratePerMonth) {
        return loanService.calculateInterestPerWeek(principal, ratePerMonth);
    }

    @GET
    @Path("/interest-per-year")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestPerYear(@QueryParam("principal") double principal, @QueryParam("clientRatePerMonth") double ratePerMonth) {
        return loanService.calculateInterestPerYear(principal, ratePerMonth);
    }

    @GET
    @Path("/rate-per-month")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateRatePerMonth(@QueryParam("interestPerMonth") double interestPerMonth, @QueryParam("principal") double principal) {
        return loanService.calculateRatePerMonth(interestPerMonth, principal);
    }

    @GET
    @Path("/principal")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculatePrincipal(@QueryParam("interestPerMonth") double interestPerMonth, @QueryParam("ratePerMonth") double ratePerMonth) {
        return loanService.calculatePrincipal(interestPerMonth, ratePerMonth);
    }
}
