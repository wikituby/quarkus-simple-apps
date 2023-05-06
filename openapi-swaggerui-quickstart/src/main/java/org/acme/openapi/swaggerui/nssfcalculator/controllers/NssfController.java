package org.acme.openapi.swaggerui.nssfcalculator.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.acme.openapi.swaggerui.nssfcalculator.services.NssfService;


    @Path("/nssfCalculator")
    public class NssfController {

        @Inject
        NssfService nssfService;

        @GET
        @Path("/Employee NetPay")
        @Produces(MediaType.TEXT_PLAIN)
        public String calculateNetPay(@QueryParam("clientGrossAmount") double clientGrossAmount) {
            return nssfService.calculateNetPay(clientGrossAmount);
        }

        @GET
        @Path("/Employee grossPay")
        @Produces(MediaType.TEXT_PLAIN)
        public String calculateGrossAmount(@QueryParam("clientNssf") double clientNssf) {
            return nssfService.calculateGrossAmount(clientNssf);
        }

        @GET
        @Path("/NSSF Rates And Info")
        @Produces(MediaType.TEXT_PLAIN)
        public String calculateRatesAndInfo(){
            return nssfService.calculateRatesAndInfo();
        }

        @GET
        @Path("/Nssf Contributions")
        @Produces(MediaType.TEXT_PLAIN)
        public String calculateNssfContribution(@QueryParam("clientGrossAmount") double clientGrossAmount) {
            return nssfService.calculateNssfContribution(clientGrossAmount);
        }

    }
