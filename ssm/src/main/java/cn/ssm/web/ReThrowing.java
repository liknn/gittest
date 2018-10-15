package cn.ssm.web;

public class ReThrowing {

	static void f() throws Exception {
		throw new Exception("f() exception");
	}

	static void d() throws Exception {
		
		try {
			f();
		} catch (Exception e) {
			System.out.println("start d()");
			e.printStackTrace();
			throw e;
		}
	}

	static void a() throws Exception {
		
		try {
			d();
		} catch (Exception e) {
			System.out.println("start a()");
			e.printStackTrace();
			throw (Exception) e.fillInStackTrace();
		}
	}

	static void q() throws Exception {
		try {
			a();
		} catch (Exception e) {
			System.out.println("start q()");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			q();
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}


}
