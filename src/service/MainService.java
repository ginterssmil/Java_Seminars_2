package service;

import java.util.ArrayList;
import java.util.Arrays;

//import model.*   importe visu no model
import model.Student;
import model_enums.ProfDegree;
import model.Professor;
import model.Course;
import model.Grade;
public class MainService {

	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();

	public static void main(String[] args) {
		System.out.println("----------- Students--------------");
		Student stud1 = new Student();		
		Student stud2 = new Student("Janis", "Loks", "123415-51034");
		Student stud3 = new Student("Gilberts", "Sals", "120405-51034");
		
		allStudents.add(stud1);
		allStudents.add(stud2);
		allStudents.add(stud3);
		
		for(Student tempS : allStudents) {
			System.out.println(tempS);
		}
		
		
		System.out.println("---------Professors--------------");
		Professor prof1 = new Professor();		
		Professor prof2 = new Professor("Vairis", "Caune", "124515-67891", ProfDegree.bachelor);
		Professor prof3 = new Professor("Ginters", "SmiLtins", "124515-67111", ProfDegree.master);
		
		allProfessors.addAll(Arrays.asList(prof1, prof2, prof3));
		
		System.out.println(allProfessors);

		
		System.out.println("---------Course--------------");
		Course course1 = new Course();
		Course course2 = new Course("Algoritmu teorija",(byte)3,prof2);
		Course course3 = new Course("Elektronika",(byte)30, prof3);

		allCourses.addAll(Arrays.asList(course1, course2, course3));
		
		System.out.println(allCourses);

		
		
		System.out.println("---------Grade--------------");
		Grade grade1 = new Grade();
		Grade grade2 = new Grade(10,stud2,course1);
		Grade grade3 = new Grade(10, stud2, course2);
		
		allGrades.addAll(Arrays.asList(grade1, grade2, grade3));

		System.out.println(allGrades);

	}
}
