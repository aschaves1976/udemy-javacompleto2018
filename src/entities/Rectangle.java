package entities;

public class Rectangle {
	double width;
	double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area() {
		return getWidth() * getHeight();
	}

	public double perimeter() {
		return 2 * (getWidth() + getHeight());
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
	}

	public String toString() {
		return String.format("Area     : %.2f%n", area()) + String.format("Perimeter: %.2f%n", perimeter())
				+ String.format("Diagonal : %.2f%n", diagonal());
	}
}
