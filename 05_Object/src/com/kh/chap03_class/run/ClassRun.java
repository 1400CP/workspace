package com.kh.chap03_class.run;

public class ClassRun {

	public static void main (String[] args) {
		/*
		Person p = new Person();
		
		System.out.println(p.getId()); 				// null
		System.out.println(p.getAge());				// 0
		
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// 초기화값이 들어있음!! => JVM이 넣어놨음!
		
		p.setId("userId");
		p.setPwd("pwd01");
		p.setName("LYH");
		p.setAge(1);
		p.setGender('M');
		p.setPhone("010-5585-5555");
		p.setEmail("sisisi@naver.com");
		
		System.out.println("=== 값 대입 후 ===");
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getEmail());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getPwd());
		*/
		
		
		// 1. 첫번째 방법 : 기본생성자로 객체 생성 후 setter 메소드 호출해서 값 대입
		
		/*
		Product p1 = new Product("갤럭시", 1200000, "삼성");

		p1.setpName("Galaxy");
		p1.setPrice(1200000);
		p1.setBrand("Samsung");
		
		System.out.println(p1.getpName());
		System.out.println(p1.getprice());
		System.out.println(p1.getbrand());
		
		
		System.out.println("pName : " + p1.getpName() + ", price : " +p1.getprice() + ", brand : " + p1.getbrand());
		*/
		
		
		// 2. 두번째 방법 : 매개변수 생성자로 생성과 동시에 값 초기화
		
		/*
		
		Product p1 = new Product("갤럭시", 1200000, "삼성");				// 순서 잘 지키자.
		Product p2 = new Product("아이폰", 1300000, "애플");				// 순서 잘 지키자.
		
		System.out.println("pName : " + p1.getpName() + ", price : " +p1.getprice() + ", brand : " + p1.getbrand());
		System.out.println("pName : " + p2.getpName() + ", price : " + p2.getprice() + ", brand : " + p2.getbrand());
		
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		*/
		/*
		Product p3 = new Product();
		p3.setpName("아쩌구");
		p3.setPrice(2000);
		p3.setBrand("자쩌구");
		
		System.out.println("=== 상품1 ===");
		System.out.println("상품명 : " + p3.getpName());
		System.out.println("가격 : " + p3.getprice());
		System.out.println("브랜드 : " + p3.getbrand());
		
		Product p4 = new Product();
		p4.setpName("이쩌구");
		p4.setPrice(2000);
		p4.setBrand("지쩌구");
		
		System.out.println("=== 상품2 ===");
		System.out.println("상품명 : " + p4.getpName());
		System.out.println("가격 : " + p4.getprice());
		System.out.println("브랜드 : " + p4.getbrand());
		
		Product p5 = new Product();
		p5.setpName("우쩌구");
		p5.setPrice(2000);
		p5.setBrand("주쩌구");
		
		System.out.println("=== 상품3 ===");
		System.out.println("상품명 : " + p5.getpName());
		System.out.println("가격 : " + p5.getprice());
		System.out.println("브랜드 : " + p5.getbrand());
		*/
		
	}
	
}
