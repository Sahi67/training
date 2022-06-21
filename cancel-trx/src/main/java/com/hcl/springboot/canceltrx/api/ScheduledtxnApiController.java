package com.hcl.springboot.canceltrx.api;

import com.hcl.springboot.canceltrx.api.model.Scheduledtxn;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class ScheduledtxnApiController implements ScheduledtxnApi {

    private static final Logger log = LoggerFactory.getLogger(ScheduledtxnApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ScheduledtxnApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addScheduledTransaction(@Parameter(in = ParameterIn.DEFAULT, description = "Scheduled txn that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody Scheduledtxn body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteScheduledtxn(@Parameter(in = ParameterIn.PATH, description = "Scheduledtxn id to delete", required=true, schema=@Schema()) @PathVariable("scheduledtxn") Long scheduledtxn) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Scheduledtxn> getScheduledTxnById(@Parameter(in = ParameterIn.PATH, description = "ID of Scheduledtxn to return", required=true, schema=@Schema()) @PathVariable("scheduledtxn") Long scheduledtxn) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Scheduledtxn>(objectMapper.readValue("{\n  \"txnvalue\" : 100,\n  \"enddate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"merchant\" : \"doggie\",\n  \"id\" : 0,\n  \"startdate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"txndate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"totalvalue\" : 1200,\n  \"paymentcount\" : 12\n}", Scheduledtxn.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Scheduledtxn>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Scheduledtxn>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Scheduledtxn>> getScheduledtxnByCustomerId(@Parameter(in = ParameterIn.PATH, description = "ID of customerid for which trx to be fetched", required=true, schema=@Schema()) @PathVariable("customerid") Long customerid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Scheduledtxn>>(objectMapper.readValue("[ {\n  \"txnvalue\" : 100,\n  \"enddate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"merchant\" : \"doggie\",\n  \"id\" : 0,\n  \"startdate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"txndate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"totalvalue\" : 1200,\n  \"paymentcount\" : 12\n}, {\n  \"txnvalue\" : 100,\n  \"enddate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"merchant\" : \"doggie\",\n  \"id\" : 0,\n  \"startdate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"txndate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"totalvalue\" : 1200,\n  \"paymentcount\" : 12\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Scheduledtxn>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Scheduledtxn>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateScheduledtxn(@Parameter(in = ParameterIn.DEFAULT, description = "Scheduled txn  that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody Scheduledtxn body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
