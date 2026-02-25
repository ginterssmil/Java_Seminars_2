package service;

import model.Student;

public class MainService {

	public static void main(String[] args) {
		Student stud1 = new Student();
		System.out.println(stud1);
		
		Student stud2 = new Student("Gint", "Smilt", "123415-51034");
		System.out.println(stud2);

		Student stud3 = new Student("Gint2", "SmiLt", null);
		System.out.println(stud3);
	}
}
