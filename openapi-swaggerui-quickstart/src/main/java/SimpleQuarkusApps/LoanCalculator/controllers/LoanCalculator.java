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
    @Path("/interestPerMonth")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestToBePaidPerMonth(@QueryParam("clientAmountToBeBorrowed") double clientAmountToBeBorrowed, @QueryParam("clientRatePerMonth") double clientRatePerMonth) {
        return loanService.calculateInterestToBePaidPerMonth(clientAmountToBeBorrowed, clientRatePerMonth);
    }

    @GET
    @Path("/interestPerDay")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestToBePaidPerDay(@QueryParam("clientAmountToBeBorrowed") double clientAmountToBeBorrowed, @QueryParam("clientRatePerMonth") double clientRatePerMonth) {
        return loanService.calculateInterestToBePaidPerDay(clientAmountToBeBorrowed, clientRatePerMonth);
    }

    @GET
    @Path("/interestPerWeek")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestToBePaidPerWeek(@QueryParam("clientAmountToBeBorrowed") double clientAmountToBeBorrowed, @QueryParam("clientRatePerMonth") double clientRatePerMonth) {
        return loanService.calculateInterestToBePaidPerWeek(clientAmountToBeBorrowed, clientRatePerMonth);
    }

    @GET
    @Path("/interestPerYear")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateInterestToBePaidPerYear(@QueryParam("clientAmountToBeBorrowed") double clientAmountToBeBorrowed, @QueryParam("clientRatePerMonth") double clientRatePerMonth) {
        return loanService.calculateInterestToBePaidPerYear(clientAmountToBeBorrowed, clientRatePerMonth);
    }

    @GET
    @Path("/Rate Per Month")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateRatePerMonth(@QueryParam("clientInterestPerMonth") double clientInterestPerMonth, @QueryParam("clientAmountToBorrow") double clientAmountToBorrow) {
        return loanService.calculateRatePerMonth(clientInterestPerMonth, clientAmountToBorrow);
    }

    @GET
    @Path("/Amount To Be Borrowed")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateAmountToBeBorrowed(@QueryParam("clientInterestPerMonth") double clientInterestPerMonth, @QueryParam("clientRatePerMonth") double clientRatePerMonth) {
        return loanService.calculateAmountToBeBorrowed(clientInterestPerMonth, clientRatePerMonth);
    }
}
