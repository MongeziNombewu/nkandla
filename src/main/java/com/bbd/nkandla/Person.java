package com.bbd.nkandla;

public class Person {
	public enum Gender {MALE, FEMALE};
	
	private int age;
	private Gender gender;
	private String name;
	
	public Person (String name, int age, Gender gender){
		this.gender = gender;
		this.name=name;
		this.age=age;
		}
		
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public Gender getGender(){
		return this.gender;
	}

}
