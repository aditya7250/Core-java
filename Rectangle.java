package Polymorphism;
public class Rectangle extends Shape {
	private double a;

	public void findArea() {
		a = 9.6*4.2;
	}

	public void printArea() {
		System.out.println("Rectangle's Area: " + a);
	}

}