package com.cg.oopsexamples;
abstract class Shape1{
	abstract void draw();
}

//creating Rectangle,Line,Cube subclasses under Shape base class

class Rectangle extends Shape1 {
	void draw() {
		System.out.println("Rectangle created");
	}
}
class Line extends Shape1{
	void draw() {
		System.out.println("Line is created");
	}
}
class Cube extends Shape1 {
	void draw() {
		System.out.println("cube created"); 
	}
}

public class Shape{
	public static void main(String[] args) {
		Line l=new Line();
		Rectangle r=new Rectangle();
		Cube c=new Cube();
		l.draw();
		r.draw();
		c.draw();
	}

}
