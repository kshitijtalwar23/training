package com.Training.utils;

import java.util.Comparator;

import com.Training.Student;
import com.Training.Warden;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Student s1 =new Student(101,"Ramesh","A");
		Student s2 =new Student(102,"Rajesh","C");
		Student s3 =new Student(103,"Rakesh","D");
		Student s4 =new Student(104,"Rasesh","B");
		
		Warden warden=new Warden();
		
		warden.addStudent(s1);
		warden.addStudent(s2);
		warden.addStudent(s3);
		warden.addStudent(s4);
		
		//warden.showStudentList();
		//warden.showStudentListByName();
		
		StudentComparators outer= new StudentComparators();
		StudentComparators.IdComparator idComp=outer.new IdComparator();
		StudentComparators.gradeComparator grComp=outer.new gradeComparator();
		
		//warden.studentList(idComp);
		warden.studentList(grComp);
		
	}

}
