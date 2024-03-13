package com.kodnest.abstraction;

import com.kodnest.abstraction.CivilStudent.MechStudent;

public class demo {
	public static void main(String args[]) {
		studentactivities s;
		s=new CivilStudent();
		s.study();
		s.sleep();
		s=new Mechstudent();
		s.study();
		s.sleep();
		
	}

}
