package com.kodnest.abstraction;

public interface student {
	String name="chitti";
	int age=15;
}
class stu1 implements student{
	String address="Allagadda";
	void display() {
		System.out.println("name");
	}
}
class stu2 extends stu1{
	void display() {
		System.out.println("name");
		System.out.println("age");
		System.out.println("address");
 }
}
