package com.springcore.contructorinjection;

/**
 * The purpose of the class is to depict the ambiguity in constructor injection.
 * By default, String is preferred value for type matching, if not
 * order/sequence of constructor declaration matters
 */
public class Addition {
	private int a;
	private int b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("This is int");
	}

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("This is double");
	}

	// If config file does not mentions the type attribute, then spring prefers to
	// call this constructor as default one
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("This is double");
	}

	public void doSum() {
		System.out.println("Sum is : " + (this.a + this.b));
	}

}
