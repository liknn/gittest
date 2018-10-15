package cn.ssm.web;

import javax.management.RuntimeErrorException;

public class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	public static void main(String[] args) {
		LostMessage lm = new LostMessage();

//		try {
//			try {
//				lm.f();
//			} finally {
//				lm.dispose();
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		try {
			throw new RuntimeException();
		}finally {
			return;
		}
		

	}
}

class VeryImportantException extends Exception {
	public String toString() {
		return "VeryImportantException";
	}
}

class HoHumException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "HoHumException";
	}
}
