package com.oop.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Rajesh", 5000.0);
		Employee emp2 = new Employee("Ramesh", 6500);
		Employee emp3 = new Employee("Sujith", 4000.0);
		Employee emp4 = new Employee("Gokul", 5001.0);
		Employee emp5 = new Employee("Mrudulla", 4500.0);

		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		System.out.println("Before Sorting : "+list);
		Collections.sort(list, new SortBySalaryComparator());
		System.out.println("After Sorting : "+list);
	}

}
