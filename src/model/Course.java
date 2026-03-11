package model;


import model.Professor;

public class Course {
	private long courseId;
	private String title;
	private byte creditPoints;
	private Professor professor;
	
	private static long counter = 20000;
	
	//getters
	public long getCourseId() {
		return courseId;
	}

	public String getTitle() {
		return title;
	}

	public byte getCreditPoints() {
		return creditPoints;
	}

	public Professor getProfessor() {
		return professor;
	}
	
	
	//setters
	public void setCourseId() {
		courseId = counter;
		counter++;
	}

	public void setTitle(String inputTitle) {
		if ( (inputTitle != null) && (inputTitle.matches("[A-Z]{1}[A-Za-z0-9]{1,40}"))) {
			title = inputTitle;
		}
		else {
			title = "Unknown";
		}
	}

	public void setCreditPoints(byte inputCreditPoints) {
		if ((inputCreditPoints >= 1) && (inputCreditPoints <=30)) {
			creditPoints = inputCreditPoints;
		}
	}

	public void setProfessor(Professor inputProfessor) {
		if ( (inputProfessor != null) ) {
			professor = inputProfessor;
		}
	}
	
	
	public Course() {
		setCourseId();
		setCreditPoints((byte)6);
		setTitle("JAVA");
		setProfessor(new Professor());
	}
	
	public Course( String inputTitle, byte inputCreditPoints, Professor inputProfessor) {
		setCourseId();
		setTitle(inputTitle);
		setCreditPoints(inputCreditPoints);
		setProfessor(inputProfessor);
	}

	
	public String toString() {
		String result = courseId + ": " + title + " (" + creditPoints + "), "
	+ professor.getName().charAt(0) + ". " + professor.getSurname();
		return result;
	}
	
	
}
