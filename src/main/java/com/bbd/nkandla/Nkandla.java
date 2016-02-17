package com.bbd.nkandla;

public class Nkandla extends Homestead {
	
	private ChickenRun mChickenRun;
	private SwimmingPool mSwimmingPool;
	private Amphitheatre mAmphitheatre;
	private static Nkandla instance;
	
	public Nkandla(String name, String district, String Province, String country) {
		super(name, district, Province, country);
		
		this.mCountry = country;
		this.mDistrict = district;
		this.mName = name;
		this.mProvince = Province;
	}
	
	public String getName (){
		return mName;
	}
	
	public String getDistrict(){
		return mDistrict;
	}
	
	public String getProvince(){
		return mProvince;
	}
	
	public String getCountry(){
		return mCountry;
	}
	
	public void setSwimmingPool(SwimmingPool swimmingPool) {
		this.mSwimmingPool = swimmingPool;
	}
	
	public static Nkandla getInstance (String name, String district, String Province, String country)
	{
		if (instance == null)
		{
			instance = new Nkandla(name, district, Province, country);
		}
		return instance;
	}

	@Override
	public String toString() { 
		return "Name: " + this.mName + " Country " + this.mCountry;
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
	public static void main (String[] args){
		System.out.println(Nkandla.getInstance("Zuma", "", "Gauteng", "ZA"));
		System.out.println(Nkandla.getInstance("", "", "", ""));
	}
	
}
