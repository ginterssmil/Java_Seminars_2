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
	public void setProf_id() {
		prof_id = counter;
		counter++;
	}
	
	public void setName(String input_name) {
		if( (input_name != null) && (!input_name.isEmpty()) && (input_name.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?")) ) {
			name = input_name;
		}
		else {
			name = "Unknown";
		}
	}
	
	public void setSurname(String input_surname) {
		if( (input_surname != null) && (!input_surname.isEmpty()) && (input_surname.matches("[A-Z]{1}[a-z]{2,15}([-]{1}[A-Z]{1}[a-z]{2,15})?")) ) {
			surname = input_surname;
		}
		else {
			surname = "Unknown";
		}
	}
	
	public void setPerson_code(String input_person_code) {
		if( (input_person_code != null) && (!input_person_code.isEmpty()) && (input_person_code.matches("[0-9]{6}[-]{1}[0-9]{5}")) ) {
			person_code = input_person_code;
		}
		else {
			person_code = "Unknown";
		}
	}
	
	public void setDegree(ProfDegree inputDegree) {
		if(inputDegree != null) {
			degree = inputDegree;
		}
		else {
			degree = ProfDegree.unknown;
		}
	}
	
	
	
	public Professor() {
		setProf_id();
		setName("Janis");
		setSurname("Sula");
		setPerson_code("123456-12345");
		setDegree(ProfDegree.unknown);
		
	}
	
	public Professor(String input_name, String input_surname, String input_person_code,ProfDegree input_degree) {
		setProf_id();
		setName(input_name);
		setSurname(input_surname);
		setPerson_code(input_person_code);
		setDegree(input_degree);
	}
	
	
	@Override
	public String toString() {
		String result = prof_id + ": " + name + " " + surname + " " + degree + " ( " + person_code + " ) ";
		return result;
	}
	
	
}
