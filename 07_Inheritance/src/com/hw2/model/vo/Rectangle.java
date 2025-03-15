package com.hw2.model.vo;

public class Rectangle extends Point{
	
	private double width;
	private double height;
	
	public Rectangle() {};
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	//getter - setter
	
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
	
	
	// draw
	public void draw() {
		super.draw();
		System.out.printf(", width : %.1f, height : %.1f, 면적 : %.1f, 둘레 : %.1f", width, height, width * height, 2 * (width + height));
	}
	
}
