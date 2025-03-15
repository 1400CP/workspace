package com.kh.run;

import com.kh.operator.A_LogicalNegation;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Comparison;
import com.kh.operator.E_Logical;
import com.kh.operator.F_Triple;
import com.kh.operator.G_Compound;

public class OperatorRun {
	
	public static void main(String[] args) {
		
		A_LogicalNegation a = new A_LogicalNegation();
		a.method1();
		
		B_InDecrease b = new B_InDecrease();
		b.method1();
		// b.method2();
		// b.method3();
		// b.method4();
		
		C_Arithmetic c = new C_Arithmetic();
		c.quiz1();
		
		D_Comparison d = new D_Comparison();
		d.method1();
		// d.method2();
		
		E_Logical e = new E_Logical();
		e.method1();
		// e.method2();
		// e.method3();
		// e.method4();
		// e.method5();
		
		F_Triple f = new F_Triple();
		// f.method1();
		// f.method2();
		// f.method3();
		// f.method4();
		// f.method5();
		f.method6();
		
		G_Compound g = new G_Compound();
		g.method1();
				
	}

}
