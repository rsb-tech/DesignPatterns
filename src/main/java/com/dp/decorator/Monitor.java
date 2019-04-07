package com.dp.decorator;

/**
 * This is a decorator which is a wrapper class, and it will wrap computer object
 * @author Admin
 *
 */
public class Monitor extends DacoratorComponent{
	Computer computer;
	public Monitor(Computer comp){
		computer = comp;
	}
	@Override
	public String Description() {
		return computer.Description() + " and a monitor";
	}
	
}
