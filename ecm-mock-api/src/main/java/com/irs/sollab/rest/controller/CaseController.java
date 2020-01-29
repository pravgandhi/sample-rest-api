package com.irs.sollab.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irs.sollab.rest.model.Case;
import com.irs.sollab.rest.service.ICaseService;

@RestController
@RequestMapping(path = "/case")
public class CaseController {

    @Autowired
    private ICaseService caseService;
    
	  	@PostMapping(path= "/", consumes = "application/json", produces = "application/json")
	    public ResponseEntity persistCase(@RequestBody Case ecmCase){ 
	  		String status = "saved";
	  		if("saved".equalsIgnoreCase(status)) {
	  			return ResponseEntity.status(HttpStatus.OK).body("Case Saved");
	  		} else {
	  			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	  		}
	    }
	  		
}
