package com.irs.sollab.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irs.sollab.rest.model.TaxPayerRecord;
import com.irs.sollab.rest.service.ICade2Service;


@RestController
@RequestMapping(path = "/getCustomerData")
public class Cade2Controller {

       
    @Autowired
    private ICade2Service cade2Service;
	
    @GetMapping(path="/{customerID}", produces = "application/json")
    public ResponseEntity getCustomerData(@PathVariable String customerID){
    	TaxPayerRecord taxPayerRecord = cade2Service.getMockData(customerID);
    	if (taxPayerRecord == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }  else {
        	return ResponseEntity.status(HttpStatus.OK).body(taxPayerRecord);
        }
    }       
}
