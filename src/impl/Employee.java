package impl;

import skeleton.Person;

import java.util.UUID;

public class Employee extends Person {
	String department;
	String job;

	public Employee(String name, String department, String job) {
		super(name);
		this.department = department;
		this.job = job;
	}

	@Override
	public String toString() {
		return (super.toString()+" "+department+" "+job);
	}
}
