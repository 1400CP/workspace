package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic{
	
	public static final String CPU = "intel";				// static은 가져올 수 있고, 파이널이라서 고정이니까 뭘 못함.
	
	private String graphic;
	
	public Desktop() {}
	
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	
	// getter - setter
	
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	
	
	public String toString() {
		return super.toString() + ", graphic : " + graphic;
	}
	

}
