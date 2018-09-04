package entities;

import entities.enums.Color;

public class Circle extends Shape {
	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		setRadius(radius);
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(getRadius(), 2);
	}

	@Override
	public final String toString() {
		// TODO Auto-generated method stub
		return String.format("Circle: %.2f - %s\n", area(), super.toString());
	}
}
