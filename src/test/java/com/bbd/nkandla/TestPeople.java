package com.bbd.nkandla;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bbd.nkandla.Person.Gender;

public class TestPeople {

	President president;
	Politician politician1;
	Politician politician2;
	Nkandla nkandla;
	
	@Before
	public void setUp() throws Exception {
		president = new President("Jacob Zuma", 53, Person.Gender.MALE);
		politician1 = new Politician("Hellen Zille", 50, Person.Gender.FEMALE);
		politician2 = new Politician("Julius Malema", 38, Person.Gender.MALE);
		nkandla = new Nkandla ("Zuma", "Wierda", "Gauteng", "ZA");
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
		assertEquals(Person.Gender.FEMALE, politician1.getGender());
		assertEquals(Person.Gender.MALE, politician2.getGender());
		assertEquals(Person.Gender.MALE, president.getGender());
	}
	
	@Test (expected = RuntimeException.class)
	public void testVisitors() {
		politician1.visit(nkandla);
		politician2.visit(nkandla);		
	}
	
	@Test
	public void testPresidentialEmployees() {
		//assertNotNull(president.getLawyer());	
		//assertNotNull(president.getArchitect());	
	}
	
	@Test
	public void testmakePolitician() {
		Politician politician1 = PoliticianFactory.makePolitician(PoliticianType.DA, "Hellen Zille", 45, Gender.FEMALE);
		assertEquals(PoliticianType.DA, politician1.getType());
		Politician politician2 = PoliticianFactory.makePolitician(PoliticianType.EFF, "Julius Malema", 45, Gender.MALE);
		assertEquals(PoliticianType.EFF, politician2.getType());
		
	}
	
	
}
