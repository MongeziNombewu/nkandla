package com.bbd.nkandla;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPeople {

	President president;
	Politician politician1;
	Politician politician2;
	
	@Before
	public void setUp() throws Exception {
		president = new President("Jacob Zuma", 53, Gender.MALE);
		politician1 = new Politician("Hellen Zille", 50, Gender.FEMALE);
		politician2 = new Politician("Julius Malema", 38, Gender.MALE);
	}

	@Test
	public void testNames() {
		assertEquals("Hellen Zille", politician1.getName());
		assertEquals("Julius Malema", politician2.getName());
		assertEquals("Jacob Zuma", president.getName());
	}

	@Test
	public void testAges() {
		assertEquals(50, politician1.getAge());
		assertEquals(38, politician2.getAge());
		assertEquals(53, president.getAge());
	}
	
	@Test
	public void testGenders() {
		assertEquals(Gender.FEMALE, politician1.getGender());
		assertEquals(Gender.MALE, politician2.getGender());
		assertEquals(Gender.MALE, president.getGender());
	}
	
	@Test (expected = RuntimeException.class)
	public void testVisitors() {
		politician1.visit();
		politician2.visit();		
	}
	
	@Test
	public void testPresidentialEmployees() {
		assertNotNull(president.getLawyer());	
		assertNotNull(president.getArchitect());	
	}
}
