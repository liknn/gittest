package cn.ssm.web;

import java.io.FileNotFoundException;
import java.io.IOException;

class WapCheckedException {
	void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0:
				throw new FileNotFoundException();
			case 1:
				throw new IOException();
			case 2:
				throw new RuntimeException("Œ“ «À≠£ø");
			default:
				return;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class SomeOtherException extends Exception {

}

public class TurnOffChecking {
	public static void main(String[] args) {
		WapCheckedException wce = new WapCheckedException();
		wce.throwRuntimeException(3);

		for (int i = 0; i < 4; i++) {
			try {
				if (i < 3) {
					wce.throwRuntimeException(i);
				} else {
					throw new SomeOtherException();
				}
			} catch (SomeOtherException e) {
				System.out.println("SomeOtherException " + e);
			} catch (RuntimeException e) {
				try {
					throw e.getCause();
				} catch (FileNotFoundException e2) {
					System.out.println("FileNotFoundException " + e2);
				} catch (IOException e2) {
					System.out.println("IOException " + e2);
				} catch (Throwable e2) {
					System.out.println("Throwable " + e2.getMessage());
				}
			}

		}

	}
}
