package entities;

import entities.enums.Color;

public abstract class Shape {
	Color color;

	public Shape() {

	}

	public Shape(Color color) {
		setColor(color);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract Double area();

	public String toString() {
		return "Color: " + getColor();
	}

}
