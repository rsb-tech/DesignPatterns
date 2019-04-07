package com.dp.test;

import com.dp.decorator.Computer;
import com.dp.decorator.Disk;
import com.dp.decorator.Monitor;

public class DacoratorPatternTest {

	public static void main(String[] args) {
		Computer comp = new Computer();
		comp = new Disk(comp);
		comp = new Monitor(comp);
		System.out.println("it is a "+ comp.Description());
	}

}
