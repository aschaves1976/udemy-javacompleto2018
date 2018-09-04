package entities;

import entities.enums.Color;

public class Rectangle01 extends Shape {

	private Double width;
	private Double height;

	public Rectangle01() {
		super();

	}

	public Rectangle01(Color color, Double width, Double height) {
		super(color);
		setWidth(width);
		setHeight(height);
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return getWidth() * getHeight();
	}

	@Override
	public final String toString() {
		// TODO Auto-generated method stub
		return String.format("Rectangle: %.2f - %s\n", area(), super.toString());
	}

}
