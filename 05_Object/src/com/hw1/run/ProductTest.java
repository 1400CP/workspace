package com.hw1.run;

import com.hw1.model.vo.*;

public class ProductTest {

	public static void main (String[] args) {
		
		
		Product p1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("======================================================");
		
		Product p4 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 1200000, 0.05);
		Product p5 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 1200000, 0.05);
		Product p6 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 1200000, 0.05);
		
		
		
		System.out.println(p4.information());
		System.out.println(p5.information());
		System.out.println(p6.information());
		
		int rp1 = (p1.getprice()) + (int)(p1.getprice() * p1.gettax());
		int rp2 = (p2.getprice()) + (int)(p2.getprice() * p2.gettax());
		int rp3 = (p3.getprice()) + (int)(p3.getprice() * p3.gettax());
		int rp4 = (p4.getprice()) + (int)(p4.getprice() * p4.gettax());
		int rp5 = (p5.getprice()) + (int)(p5.getprice() * p5.gettax());
		int rp6 = (p6.getprice()) + (int)(p6.getprice() * p6.gettax());
		
		
		System.out.println("======================================================");
		System.out.println("상품명 : " + p4.getproductName());
		System.out.println("부가세 포함 가격 : " + rp4);
		System.out.println("상품명 : " + p5.getproductName());
		System.out.println("부가세 포함 가격 : " + rp5);
		System.out.println("상품명 : " + p6.getproductName());
		System.out.println("부가세 포함 가격 : " + rp6);
		
		
		
	}
	
	
}
