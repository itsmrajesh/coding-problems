package com.concepts;

public class ConstructorChaining extends B {

	public static void main(String[] args) {
		ConstructorChaining c = new ConstructorChaining();
		
	}

	ConstructorChaining() {
		super();
		System.out.println("In Main");
	}

}

class B extends C {
	B() {
		super.disp();
		System.out.println("In B");
	}

	void disp() {
		System.out.println("In B Disp");
	}
}

class C {
	C() {
		System.out.println("In C");
	}

	void disp() {
		System.out.println("In B Disp");
	}
}
