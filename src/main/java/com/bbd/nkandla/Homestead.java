package com.bbd.nkandla;

public class Homestead {

	protected String mName;
	protected String mDistrict;
	protected String mProvince;
	protected String mCountry;
	
	public Homestead(String name, String district, String Province, String country) {
		this.mCountry = country;
		this.mDistrict = district;
		this.mName = name;
	}
	
	public String getName() {
		return this.mName;
	}
	
	public String getDistrict() {
		return this.mDistrict;
	}
	
	public String getProvince() {
		return this.mProvince;
	}
	
	public String getCountry() {
		return this.mCountry;
	}
}
