package com.epsilon.training.entity;

import java.util.logging.Logger;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

//final classes cannot be extended(i.e. no inheritance because it must not override)
public class Circle extends Shape {
	private double radius;
	Logger logger=Logger.getLogger(Circle.class.getName());
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void printArea() {
		double area= radius * radius * PI;
		logger.info("area of the circle = "+ area);
    
	}


}
