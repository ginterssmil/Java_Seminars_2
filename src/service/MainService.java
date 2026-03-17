package service;

import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

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
		
		
		
		System.out.println("---------CRUD testing--------------");
		try {
			createStudent("Janis", "Berzins", "025004-12345");
			System.out.println(allStudents);
			System.out.println(getStudentById(4));
			System.out.println(updateById(0, "Ilmars", "Sula"));
			deleteById(4);
			System.out.println(allStudents);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("---------filter testing--------------");
		try {
			System.out.println(filterProfessorsByDegree(ProfDegree.master));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//CRUD create retrieve update delete
	//only making crud for student class
	
	//create
	public static void createStudent(String inputName, String inputSurname, String inputPersonCode) throws Exception {
		//TODO parbauda ienakosos parametrus
		
		for(Student tempS : allStudents) {
			if(tempS.getPersonCode().equals(inputPersonCode)) {
				throw new Exception("tads student jau eksiste");
			}
		}
		
		Student newStudent = new Student(inputName, inputSurname, inputPersonCode);
		allStudents.add(newStudent);
	}
	
	//retrieve by id
	public static Student getStudentById(long id) throws Exception{
		if(id<0) {
			throw new Exception("id nevar but negativs");
		}
		for(Student tempS : allStudents) {
			if(tempS.get_stud_id() == id) {
				return tempS;
			}
		}
		
		throw new Exception("students ar" + id + "neeksiste ");
	}
	
	
	//U - update
	public static Student updateById(int id, String inputName, String inputSurname) throws Exception {
		Student studentForUpdating = getStudentById(id);
		
		//
		if(!studentForUpdating.getName().equals(inputName)) {
			studentForUpdating.setName(inputName);
		}
		
		if(!studentForUpdating.getSurname().equals(inputSurname)) {
			studentForUpdating.setSurname(inputSurname);
		}
		
		return studentForUpdating;
	}
	
	//D - delete
	
	public static void deleteById(int id) throws Exception{
		Student studentForDeleting = getStudentById(id);
		allStudents.remove(studentForDeleting);
	}
	
	
	public static ArrayList<Professor> filterProfessorsByDegree(ProfDegree inputDegree) throws Exception{
		if(inputDegree == null) {
			throw new Exception("Neeksistejos grads");
		}
		ArrayList<Professor> result = new ArrayList<Professor>();
		for(Professor tempP: allProfessors) {
			if(tempP.getDegree().equals(inputDegree)) {
				result.add(tempP);
			}
		}
		
		if(result.isEmpty()) {
			throw new Exception("Sistema nav profesoru ar " + inputDegree + "gradu");
		}
		
		return result;
	}
	
	
	public static float calculateAVGgradeForStudent(String input_person_code) throws Exception {
		if( (input_person_code != null) || (!input_person_code.isEmpty()) || !input_person_code.matches("[0-9]{6}[-]{1}[0-9]{5}" )) {
			throw new Exception("Nepareizi ievades dati")
		}
		int count = 0;
		float sum = 0;
		for(Grade tempG: allGrades) {
			if(tempG.getStudent().getPersonCode().equals(input_person_code)) {
				count++;
				sum = sum + tempG.getValue();
			}
		}
		
		if(count == 0) {
			throw new Exception("Studenta ar personas kodu" + input_person_code + "nav nevienas atzimes, tapec nevar izrekinat videjo atzimi");
			
		}
		
		return(sum/count);
			
		}
}
