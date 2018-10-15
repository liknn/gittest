package cn.ssm.web;

public class NeverCaught {

	static void f() {
		throw new RuntimeException("from f()");
	}

	static void g() {
		f();
	}

	public static void main(String[] args) {
		System.out.println(1);
		g();
		System.out.println(2);
	}
}
