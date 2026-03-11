package model;

//modelu klase()
public class Student extends Person{
	//1. mainigie
	private long stud_id;

	
	// paligmainigais, nevajag set, get
	private static long counter = 0;
	
	//2. get funkcijas
	public long get_stud_id() {
		return stud_id;
	}

	//3. set funkcijas
	public void set_stud_id() {
		stud_id = counter;
		counter++;
	}
	
	
	//4.1 bezargumenta funkcijas
	public Student() {
		super();
		set_stud_id();

		//super aizstj sos jo tie tiek izsaukti no Person klases
		//setName("Janis");
		//setSurname("Berzins-Kalnins");
		//setPersonCode("121212-12345");
	}
	
	//4.2 argumenta funkcijas
	
	public Student(String input_name, String input_surname, String input_person_code) {
		super(input_name, input_surname, input_person_code);
		set_stud_id();

	}
	
	//5. toString funkcijas
	@Override
	public String toString() {
		String result = stud_id + ": " + name + " " + surname + " ( " + person_code + " ) ";
		return result;
	}
	
	//6. visas parejas funkcijas pec nepieciesamibas
}
