package com.kodnest.abstraction;

public interface studentactivities {
	void study();
	void sleep();
	void read();
	void eat();
	void play();
}
class CivilStudent implements studentactivities{

	@Override
	public void study() {
		System.out.println("studying");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeping");
		
	}

	@Override
	public void read() {
		System.out.println("reading");
		
	}

	@Override
	public void eat() {
		System.out.println("eating");
		
	}

	@Override
	public void play() {
		System.out.println("playing");
		
	}
	

class MechStudent implements studentactivities{

	@Override
	public void study() {
		System.out.println("studying");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeping");
		
	}

	@Override
	public void read() {
		System.out.println("reading");
	}
		

	@Override
	public void eat() {
		System.out.println("eating");
	}

	@Override
	public void play() {
		System.out.println("playing");
	}
 }
}
				



