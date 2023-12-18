package com.acc.Comparatordemo;

import java.util.Comparator;

public class EmployeeSalary implements Comparator<EmployeeSalary> {
	int eid;
	String name;
	double salary;
	
	public EmployeeSalary(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compare(EmployeeSalary emp1, EmployeeSalary emp2) {
		EmployeeSalary sal1 = (EmployeeSalary) emp1;
		EmployeeSalary sal2 = (EmployeeSalary) emp2;
		
		if(sal1.salary>sal2.salary) {
			//will swap
			return -1;
		}else if(sal1.salary < sal2.salary) {
			return 1;// will not swap
		}else {
			return 0;
		}
	}
}
