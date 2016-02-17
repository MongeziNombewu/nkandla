package com.bbd.nkandla;

import com.bbd.nkandla.Person.Gender;

public class PoliticianFactory {
	
	public static Politician makePolitician(PoliticianType politicianType, String name, int age, Gender gender) {
		switch (politicianType) {
		case DA:
			DA da = new DA(name, age, gender);
			da.setType(PoliticianType.DA);
			return da;

		case EFF:
			EFF eff = new EFF(name, age, gender);
			eff.setType(PoliticianType.EFF);
			return eff;

		default:
			return null;
		}
	}

}
