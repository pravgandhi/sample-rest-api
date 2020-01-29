package com.irs.sollab.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irs.sollab.rest.mapper.TaxPayerRecordMapper;
import com.irs.sollab.rest.model.TaxPayerRecord;

@Service
public class Cade2Service implements ICade2Service{
	

	    
	    @Autowired
	    private TaxPayerRecordMapper mapper;

	      
	    public TaxPayerRecord getMockData(String ein) { 
	    	TaxPayerRecord taxPayerRecord = mapper.createMockData(ein);
	    	return taxPayerRecord;
	    }
}
