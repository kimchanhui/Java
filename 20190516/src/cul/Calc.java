package cul;

import java.util.Scanner;

class A {
	private int a;
	private int b;

	public void Value(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int cal() {
		return a + b;
	}
}

class B {
	private int a, b;

	public void Value(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int cal() {
		return a - b;

	}
}

class C {
	private int a, b;

	public void Value(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int cal() {
		return a * b;
	}
}

class D {
	private int a, b;

	public void Value(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int cal() {
		return a / b;
	}
}

public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 >>");
		int a = sc.nextInt();
		char value = sc.nextLine().charAt(0);
		int b = sc.nextInt();

		switch (value) {
		case '+':
			A aa = new A();
			aa.Value(a, b);
			System.out.println("답" + aa.cal());

			break;
		case '-':
			B bb = new B();
			bb.Value(a, b);
			System.out.println("답" + bb.cal());
			break;

		case '*':
			C cc = new C();
			cc.Value(a, b);
			System.out.println("답" + cc.cal());

			break;
			
		case '/':
			D dd = new D();
			dd.Value(a, b);
			System.out.println("답" + dd.cal());
			break;
		default:
			
		}
		sc.close();
	}

}
