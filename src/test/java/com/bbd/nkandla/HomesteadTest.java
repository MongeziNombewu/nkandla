package com.bbd.nkandla;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HomesteadTest {
	
	Homestead homestead;
	Nkandla nkandla;
	Politician politician1;
	Politician politician2;
	
	@Before
	public void setup() {	
		homestead = new Homestead("Zuma", "Wierda", "Gauteng", "ZA");
		nkandla = new Nkandla ("Zuma", "Wierda", "Gauteng", "ZA");
		SwimmingPool swimmingPool = new SwimmingPool (20, 40);
		nkandla.setSwimmingPool(swimmingPool);
		ChickenRun chickenRun = new ChickenRun (30);
		nkandla.setChickenRun(chickenRun);
		Amphitheatre amphi = new Amphitheatre (80);
		nkandla.setAmphitheatre(amphi);
		
		//visiting politicians
		politician1 = new Politician("Hellen Zille", 50, Person.Gender.FEMALE);
		politician2 = new Politician("Julius Malema", 38, Person.Gender.MALE);
	}
		
		
	@Test
	public void testName(){
		assertEquals("Zuma", homestead.getName());
	}
	
	@Test
	public void testDistrict(){
		assertEquals("Wierda", homestead.getDistrict());
	}
	
	@Test
	public void testProvince(){
		assertEquals("Gauteng", homestead.getProvince());
	}
	
	@Test
	public void testCountry(){
		assertEquals("ZA", homestead.getCountry());
	}
	
	@Test (expected = RuntimeException.class)
	public void testAccept(){
		homestead.accept(politician1);
		homestead.accept(politician2);
	}	
	
	@Test
	public void testSwimmingPool(){
		assertEquals(40, nkandla.getSwimmingPool().getLength());
		assertEquals(20, nkandla.getSwimmingPool().getWidth());
	}
	
	@Test
	public void testChickenRun(){
		assertEquals(30, nkandla.getChickenRun().getNumberOfChickens());
	}
	
	@Test
	public void testAmphitheatre(){
		assertEquals(80, nkandla.getAmphitheatre().getArea());
	}

}
