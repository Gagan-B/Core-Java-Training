package com.epsilon.training.programs;

public class Cylinder extends Circle {

	private double height = 1.0;

	public Cylinder() {
	}

	public Cylinder(double radius) {
		super(radius);
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}
	

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return (2*PI*getRadius()*getHeight())+(2*PI*getRadius()*getRadius());
	}

	public static void main(String[] args) {
		
		Circle[] circles = {
				new Cylinder(12.34),
				new Cylinder(12.34, 10.0),
				new Cylinder(12.34, 10.0, "blue")
			};
		for(Circle c: circles) {
			System.out.println("Area is : "+c.getArea()+" and the Volume is :" + ((Cylinder) c).getVolume());
			
		}

	}

}
