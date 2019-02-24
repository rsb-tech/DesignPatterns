package com.dp.prototype;

import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee();
		emp.loadDataFromDB();
		Employee empNew = (Employee) emp.clone();
		Employee empNew1 = (Employee) emp.clone();
		List<String> empList = empNew.getEmpData();
		System.out.println("Employee list " + empList);
		empList.add("Carter");
		List<String> empList1 = empNew1.getEmpData();
		empList1.remove("Dave");
		System.out.println("Employee list after adding " + empList);
		System.out.println("Employee list after removing " + empList1);
	}

}
