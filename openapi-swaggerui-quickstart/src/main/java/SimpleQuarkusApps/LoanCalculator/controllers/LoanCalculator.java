package SimpleQuarkusApps.LoanCalculator.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import SimpleQuarkusApps.LoanCalculator.services.LoanService;


@Path("/loanCalculator")
public class LoanCalculator {

    @Inject
    LoanService loanService;

    @GET
    @Path("/interest Per Month")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestPerMonth(@QueryParam("principal") double principal, @QueryParam("ratePerMonth") double ratePerMonth) {
        return loanService.calculateInterestPerMonth(principal, ratePerMonth);
    }

    @GET
    @Path("/interest Per Day")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestPerDay(@QueryParam("principal") double principal, @QueryParam("ratePerMonth") double ratePerMonth) {
        return loanService.calculateInterestPerDay(principal, ratePerMonth);
    }

    @GET
    @Path("/interest Per Week")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestPerWeek(@QueryParam("principal") double principal, @QueryParam("ratePerMonth") double ratePerMonth) {
        return loanService.calculateInterestPerWeek(principal, ratePerMonth);
    }

    @GET
    @Path("/interest Per Year")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestPerYear(@QueryParam("principal") double principal, @QueryParam("clientRatePerMonth") double ratePerMonth) {
        return loanService.calculateInterestPerYear(principal, ratePerMonth);
    }

    @GET
    @Path("/Rate Per Month")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateRatePerMonth(@QueryParam("interestPerMonth") double interestPerMonth, @QueryParam("principal") double principal) {
        return loanService.calculateRatePerMonth(interestPerMonth, principal);
    }

    @GET
    @Path("/Principal")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculatePrincipal(@QueryParam("interestPerMonth") double interestPerMonth, @QueryParam("ratePerMonth") double ratePerMonth) {
        return loanService.calculatePrincipal(interestPerMonth, ratePerMonth);
    }
}
