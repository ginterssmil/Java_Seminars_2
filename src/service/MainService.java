package service;

import model.Student;
import model_enums.ProfDegree;
import model.Professor;
import model.Course;
public class MainService {

	public static void main(String[] args) {
		System.out.println("----------- Students--------------");
		Student stud1 = new Student();
		System.out.println(stud1);
		
		Student stud2 = new Student("Gint", "Smilt", "123415-51034");
		System.out.println(stud2);

		Student stud3 = new Student("Gint2", "SmiLt", null);
		System.out.println(stud3);
		
		System.out.println("---------Professors--------------");
		Professor prof1 = new Professor();
		System.out.println(prof1);
		
		Professor prof2 = new Professor("Austr", "Zeid", "124515-67891", ProfDegree.bachelor);
		System.out.println(prof2);

		Professor prof3 = new Professor("Gint2", "SmiLt", null, null);
		System.out.println(prof3);
		
		System.out.println("---------Courses--------------");

	}
}
