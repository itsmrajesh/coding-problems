package com.oop.employee;

import java.util.Comparator;

public class SortBySalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return Double.compare(emp1.getSal(), emp2.getSal()); // Ascending order
	}

}
