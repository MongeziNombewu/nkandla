package com.bbd.nkandla;

import com.bbd.nkandla.Person.Gender;

public class President extends Person {
	private Lawyer lawyer;
	private Architect architect;
	
	public President(String name, int age, Gender gender){
		super(name, age, gender);
	}
	
	public void setLawyer(Lawyer lawyer){
		this.lawyer=lawyer;
	}
	public Lawyer getLawyer(){
		return lawyer;
	}
	
	public void setArchitect(Architect architect){
		this.architect=architect;
	}
	
	public Architect getArchitect(){
		return architect;
	}

}
