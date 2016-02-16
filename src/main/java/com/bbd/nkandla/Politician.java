package com.bbd.nkandla;

import com.bbd.nkandla.Person.Gender;

public class Politician extends Person implements Visitable {
	
	public Politician(String name, int age, Gender gender){
		super(name, age, gender);
	}

	@Override
	public void visit(Homestead homestead) {
		throw new RuntimeException("Pay back the money!");
		
	}
	

}
