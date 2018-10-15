package cn.ssm.web;

@SuppressWarnings("serial")
public class SimpleException extends Exception {

	public SimpleException() {

	}

	public SimpleException(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		try {
			throw new SimpleException("123");
		} catch (SimpleException se) {
			se.printStackTrace(System.out);
		}
	}

}
