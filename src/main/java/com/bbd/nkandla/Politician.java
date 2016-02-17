package com.bbd.nkandla;

import com.bbd.nkandla.Person.Gender;

public class Politician extends Person implements Visitable {
		
	private PoliticianType type;
	
	public Politician(String name, int age, Gender gender){
		super(name, age, gender);
	}

	@Override
	public void visit(Homestead homestead) {
		throw new RuntimeException("Pay back the money!");
		
	}
	
	public PoliticianType getType() {
		return type;
	}
	public void setType(PoliticianType type){
		this.type = type;
	}
	
}
