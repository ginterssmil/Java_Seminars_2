package model;

import model_enums.ProfDegree;

public class Professor extends Person{
	private long prof_id;
	private ProfDegree degree;
	
	// paligmainigais, nevajag set, get
	private static long counter = 0;
	

	//getters
	public long getProf_id() {
		return prof_id;
	}


	public ProfDegree getDegree() {
		return degree;
	}
	
	//setters
	public void setProf_id() {
		prof_id = counter;
		counter++;
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
		super();
		setProf_id();
		setDegree(ProfDegree.unknown);
		
	}
	
	public Professor(String input_name, String input_surname, String input_person_code,ProfDegree input_degree) {
		super(input_name, input_surname, input_person_code);
		setProf_id();
		setDegree(input_degree);
	}
	
	
	@Override
	public String toString() {
		String result = prof_id + ": " + name + " " + surname + " " + degree + " ( " + person_code + " ) ";
		return result;
	}
	
	
}
