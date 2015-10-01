package com.Training.utils;

import java.util.Comparator;

import com.Training.Student;

public class StudentComparators {
	
	public class IdComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			if(o1.getStudentId()<o2.getStudentId())return -1;
			if(o1.getStudentId()>o2.getStudentId())return 1;
			else return 0;
		}
		
		
	}
	
public class gradeComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getGrade().compareTo(o2.getGrade());
	}
	}

}
