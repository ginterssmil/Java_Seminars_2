package model;

import model.Student;
import model.Course;

public class Grade {
	private long gradeId;
	private int value;
	private Student student;
	private Course course;
	
	private static long counter = 30000;

	//getters
	public long getGradeId() {
		return gradeId;
	}

	public int getValue() {
		return value;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	public static long getCounter() {
		return counter;
	}

	//setters
	public void setGradeId() {
		gradeId = counter;
		counter++;
	}

	public void setValue(int inputValue) {
		if ( (inputValue >= 1) && (inputValue <= 10) ) {
			value = inputValue;
		}
		else {
			value = 1;
		}
	}

	public void setStudent(Student inputStudent) {
		if (inputStudent != null) {
			student = inputStudent;
		}
		else {
			student = new Student();
		}
	}

	public void setCourse(Course inputCourse) {
		if (inputCourse != null) {
			course = inputCourse;
		}
		else {
			course = new Course();
		}
	}
	
	
	
	
	
	
}
