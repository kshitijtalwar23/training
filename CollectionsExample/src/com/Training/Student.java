package com.Training;

public class Student implements Comparable<Student>{

	
	private long studentId;
	private String studentName;
	private String grade;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student(long studentId, String studentName, String grade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", grade=" + grade + "]";
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		return studentName.compareTo(other.studentName);
	}
	
	
	
}
