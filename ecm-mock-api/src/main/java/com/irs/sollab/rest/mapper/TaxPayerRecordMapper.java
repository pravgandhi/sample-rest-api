package com.irs.sollab.rest.mapper;

import org.springframework.stereotype.Component;

import com.irs.sollab.rest.model.Address;
import com.irs.sollab.rest.model.TaxPayerRecord;

@Component
public class TaxPayerRecordMapper {

	
	public TaxPayerRecord createMockData(String ein) {
		TaxPayerRecord record = new TaxPayerRecord();
		record.setName("XEROX CORP");
		record.setVendorNo("VN00000004");
		record.setVendorSuffix("01");
		record.setPhoneNo("(301)-765-4321");
		record.setEin(ein);
		Address address = new Address();
		address.setAddress1("PO BOX 890990");
		address.setAddress2("SUITE 400");
		address.setCity("DALLAS");
		address.setState("TX");
		address.setZip("753890990");
		record.setAddress(address);
		record.setBusinessType("ADPICS VENDORS");
		return record;
	}
}
