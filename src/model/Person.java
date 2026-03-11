package model;

public class Person {
	private String name;
	private String surname;
	private String person_code;
	
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return person_code;
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
	
	public void setPersonCode(String input_person_code) {
		if( (input_person_code != null) && (!input_person_code.isEmpty()) && (input_person_code.matches("[0-9]{6}[-]{1}[0-9]{5}")) ) {
			person_code = input_person_code;
		}
		else {
			person_code = "Unknown";
		}
	}
	
	public Person() {
		setName("Liga");
		setSurname("Jauka");
		setPersonCode("090923- 12345");
	}
	
	public Person(String inputName, String inputSurname, String inputPersonCode) {
		setName(inputName);
		setSurname(inputSurname);
		setPersonCode(inputPersonCode);
	}
	
	public String toString() {
		String result = name + " " + surname + " " + person_code;
		return result;
	}
}
