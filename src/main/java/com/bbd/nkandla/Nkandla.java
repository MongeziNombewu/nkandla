package com.bbd.nkandla;

public class Nkandla extends Homestead {
	
	private ChickenRun mChickenRun;
	private SwimmingPool mSwimmingPool;
	private Amphitheatre mAmphitheatre;
	
	public Nkandla(String name, String district, String Province, String country) {
		super(name, district, Province, country);
		
		this.mCountry = country;
		this.mDistrict = district;
		this.mName = name;
	}
	
	public void setSwimmingPool(SwimmingPool swimmingPool) {
		this.mSwimmingPool = swimmingPool;
	}
	
	public SwimmingPool getSwimmingPool() {
		return this.mSwimmingPool;
	}
	
	public ChickenRun getChickenRun() {
		return this.mChickenRun;
	}
	
	public void setChickenRun(ChickenRun chickenRun) {
		this.mChickenRun = chickenRun;
	}
	
	public Amphitheatre getAmphitheatre() {
		return this.mAmphitheatre;
	}
	
	public void setAmphitheatre(Amphitheatre amphi) {
		this.mAmphitheatre = amphi;
	}
}
