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
        @Path("/netAmount")
        @Produces(MediaType.TEXT_PLAIN)
        public String calculateNetAmount(@QueryParam("clientGrossAmount") double clientGrossAmount) {
            return nssfService.calculateNetAmount(clientGrossAmount);
        }

        @GET
        @Path("/grossAmount")
        @Produces(MediaType.TEXT_PLAIN)
        public String calculateGrossAmount(@QueryParam("clientNssf") double clientNssf) {
            return nssfService.calculateGrossAmount(clientNssf);
        }

        @GET
        @Path("/Rate")
        @Produces(MediaType.TEXT_PLAIN)
        public String calculateRate(@QueryParam("clientGrossAmount") double clientGrossAmount, @QueryParam("clientNetAmount") double clientNetAmount) {
            return nssfService.calculateRate(clientGrossAmount, clientNetAmount);
        }

        @GET
        @Path("/Nssf")
        @Produces(MediaType.TEXT_PLAIN)
        public String calculateNssf(@QueryParam("clientGrossAmount") double clientGrossAmount) {
            return nssfService.calculateNssf(clientGrossAmount);
        }
    }
