package com.kh.chap03_map.part01_hashMap.model.vo;

public class Data {
	
	private String baby;
	private String love;
	private String apple;
	
	public Data() {}

	public Data(String baby, String love, String apple) {
		super();
		this.baby = baby;
		this.love = love;
		this.apple = apple;
	}

	public String getBaby() {
		return baby;
	}

	public void setBaby(String baby) {
		this.baby = baby;
	}

	public String getLove() {
		return love;
	}

	public void setLove(String love) {
		this.love = love;
	}

	public String getApple() {
		return apple;
	}

	public void setApple(String apple) {
		this.apple = apple;
	}

	@Override
	public String toString() {
		return "Data [baby=" + baby + ", love=" + love + ", apple=" + apple + "]";
	}
	

}
