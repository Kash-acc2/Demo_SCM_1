package com.acc.ComparableDemo;

public class EmployeeSalary implements Comparable<EmployeeSalary> {
	int eid;
	String ename;
	double salary;
	
	public EmployeeSalary(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

/*
	@Override
	public int compareTo(EmployeeSalary emp1) {
		return this.ename.compareTo(emp1.ename);
	}*/
	
	@Override
	public int compareTo(EmployeeSalary emp1) {

		
		if(emp1.salary > this.salary) {
			return -1;
		}else if(emp1.salary < this.salary) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
	
}
