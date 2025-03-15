package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {
	
	public static void main (String[] args) {
		
//		Point p = new Point();
		Circle[] c = new Circle[2];
		c[0] = new Circle(1, 2, 3);
		c[1] = new Circle(3, 3, 4);
		
		System.out.println("===============================================");
		for(int i=0; i<c.length; i++) {
			c[i].draw();
			System.out.println();
		}
		
		System.out.println("===============================================");
		Rectangle[] r = new Rectangle[2];
		r[0] = new Rectangle(-1, -2, 5, 2);
		r[1] = new Rectangle(-2, 5, 2, 8);
		
		for(int j=0; j<r.length; j++) {
			r[j].draw();
			System.out.println();
		}
		
		
	}

}
