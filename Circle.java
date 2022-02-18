package be.intecbrussel.uml;

public class Circle {

	private double radius;
	private double area;
	private double circumference;
	
	public Circle() {
		radius = 3;
	}
	
	public double setRadius() {
		return radius;
	}
	
	public double setArea(double area) {
		this.area = area;
		return area;
	}
	
	public double setCircumference() {
		return circumference;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getCircumference() {
		circumference = 2 * Math.PI * radius;
		return circumference;
	}
	
	public double getArea( ) {
		area= Math.PI * radius *radius;
        return area;
	}
	
}
