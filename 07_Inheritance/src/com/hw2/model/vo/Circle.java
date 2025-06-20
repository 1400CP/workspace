package com.hw2.model.vo;

public class Circle extends Point{
	
	private int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	// getter - setter
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	// draw()
	public void draw() {
		super.draw();
		System.out.printf(", radius : %d, 면적 : %.1f, 둘레 : %.1f", radius, Math.PI * radius * radius, Math.PI * radius * 2);				
		
	}
	
}
