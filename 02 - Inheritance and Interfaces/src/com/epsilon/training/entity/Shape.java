package com.epsilon.training.entity;

import java.util.logging.Logger;

public abstract class Shape {

	// logger is used instead of the System.out.print
	Logger logger = Logger.getLogger(Shape.class.getName());

	// private final double PI = 3.1416; - keeping it private will be difficult to
	// access it in its sub classes
	// protected static final double PI = 3.1416; //final makes it act as constant
	//public static final double PI = 3.1416; // static makes it only one copy for all the objects else every
											// object instance will have a new PI
											// public will make PI accessible out of classes too but protected
											// will make it accessible only inside the classes
	public static final double PI ;  //not assigning value while declaring
	static {
		PI = 3.14;
	}
	// sub classes cannot override final methods
	public final void info() {
		logger.info("Classname: Shape");
		logger.info("Created by: Gagan <gagan.b@epsilon.com>");

	}

	/*
	 * public void printArea() {
	 * logger.info("Area of a generic Shape cannot be calculated!"); }
	 */
	
	// sub classes must override abstract methods
	public abstract void printArea();

}
