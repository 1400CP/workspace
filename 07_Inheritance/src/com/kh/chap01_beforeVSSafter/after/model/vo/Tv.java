package com.kh.chap01_beforeVSSafter.after.model.vo;

// 상속부터 시작하즈아!
public class Tv extends Product {
	
	private int inch;
	
	public Tv() {}
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}

	//오버라이딩
	public String information() {
		return super.information() + "inch : " + inch;
	}
	
}
