package com.irs.sollab.rest.model;

public class TaxPayerRecord {
	
	private String ein;
	private String name;
	private Address address;
	private String phoneNo;
	private String businessType;
	private String vendorNo;
	private String vendorSuffix;
	
	public String getEin() {
		return ein;
	}
	public void setEin(String ein) {
		this.ein = ein.trim();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.trim();
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo.trim();
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType.trim();
	}
	public String getVendorNo() {
		return vendorNo;
	}
	public void setVendorNo(String vendorNo) {
		this.vendorNo = vendorNo.trim();
	}
	public String getVendorSuffix() {
		return vendorSuffix;
	}
	public void setVendorSuffix(String vendorSuffix) {
		this.vendorSuffix = vendorSuffix.trim();
	}
	
	
}
