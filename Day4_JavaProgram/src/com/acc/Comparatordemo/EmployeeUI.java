package com.acc.Comparatordemo;
import java.util.*;
public class EmployeeUI {

	public static void main(String[] args) {
		List<EmployeeSalary> emplist = new ArrayList<>();
		
		emplist.add(new EmployeeSalary(1,"Raju",25000.00));
		emplist.add(new EmployeeSalary(21,"Sneha",30000.00));
		emplist.add(new EmployeeSalary(13,"Aditya",45000.00));
		emplist.add(new EmployeeSalary(10,"Ram",25000.00));
		
		//For Compartor
		System.out.println("Salary Comparison");
		Collections.sort(emplist,new EmployeeSalary(0,null,0.0));
		for(EmployeeSalary empsal: emplist) {
			System.out.println("EID: "+empsal.eid);
			System.out.println("Name: "+empsal.name);
			System.out.println("Salary: "+empsal.salary);
		}
	}
}
