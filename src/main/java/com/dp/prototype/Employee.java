package com.dp.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
	private List<String> empData;
	public Employee(){
		empData = new ArrayList<String>();
	}
	public Employee(List<String> empList){
		this.empData = empList;
	}
	
	public List<String> getEmpData() {
		return empData;
	}
	public void loadDataFromDB(){
		empData.add("Wills");
		empData.add("Dave");
		empData.add("Walls");
	}
	/**
	 * clone method is overridden to provide deep copy of the list 
	 */
	@Override
	public Object clone()throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String s : this.getEmpData()){
			temp.add(s);
		}
		return new Employee(temp);
	}
}
