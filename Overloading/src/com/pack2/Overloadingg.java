package com.pack2;

class A{
	void meth1(int a ) {
		System.out.println(a);
	}
	void meth1(String a) {
		System.out.println(a);
	}
}
	
public class Overloadingg {
	public static void main(String[] args) {
		A obj=new A();
		obj.meth1(12);
		obj.meth1("varun");
	}
	
		

	}


