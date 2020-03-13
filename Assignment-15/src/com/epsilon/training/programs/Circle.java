package com.epsilon.training.programs;

/*import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString 
*/


public class Circle {
	
	public static final double PI ;  //not assigning value while declaring
	static {
		PI = 3.14;
	}

	private double radius = 1.0;
	private String color = "red";

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	public double getArea() {
		return PI*getRadius()*getRadius();
	}

}
