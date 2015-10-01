package com.Training;

import java.util.*;
import com.Training.utils.*;

public class Warden{
	
	private String wardenName;
	
	private ArrayList<Student> studList;
	
	public Warden()
	{
		studList=new ArrayList<Student>();
	}
	
	public boolean addStudent(Student stud)
	{
		boolean result=studList.add(stud);
		
		return result;
	}
	
	public void showStudentList()
	{
		for(Student stud:studList)
		{
			System.out.println(stud);
		}
	}

	public void showStudentListByName(){
		
		Collections.sort(studList);
		showStudentList();
	}
	
    /*public void showStudentListByGrade(){
		
		Collections.sort(studList);
		showStudentList();
	}because we cannot override compareTo() multiple times*/
    
	public void studentList(Comparator<Student> comp)
	{
		Collections.sort(studList,comp);
		showStudentList();
	}

}
