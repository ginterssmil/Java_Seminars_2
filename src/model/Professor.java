package model;

import model_enums.ProfDegree;

public class Professor {
	private long prof_id;
	private String name;
	private String surname;
	private String person_code;
	private ProfDegree degree;
	
	// paligmainigais, nevajag set, get
	private static long counter = 0;
	

	//getters
	public long getProf_id() {
		return prof_id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getPerson_code() {
		return person_code;
	}

	public ProfDegree getDegree() {
		return degree;
	}
	
	//setters

	public Professor() {
		set_prof_id();
		set_name("Janis");
		set_surname("Berzins-Kalnins");
		set_person_code("121212-12345");
		set_degree("Bakalaurs");
	}
	
	public Professor(String input_name, String input_surname, String input_person_code, String input_degree) {
		set_prof_id();
		set_name(input_name);
		set_surname(input_surname);
		set_person_code(input_person_code);
		set_degree(input_degree);
	}
	
}
