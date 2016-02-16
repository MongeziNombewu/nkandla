package com.bbd.nkandla;

public class Homestead {

	protected String mName;
	protected String mDistrict;
	protected String mProvince;
	protected String mCountry;
	
	public Homestead(String name, String district, String province, String country) {
		this.mCountry = country;
		this.mDistrict = district;
		this.mName = name;
		this.mProvince = province;
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
	
	public void accept(Visitable visitor){
		if (visitor != null) {
			visitor.visit(this);			
		}
	}
}
