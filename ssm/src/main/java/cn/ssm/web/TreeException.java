package cn.ssm.web;

public class TreeException extends Exception {
	static int count = 0;

	public static void main(String[] args) {
		while (true) {
			try {
				if (count++ == 0) {
					throw new TreeException();
				}
				System.out.println("no eception");
			} catch (TreeException e) {
				System.out.println("TreeException");
			} finally {
				System.out.println(count);
				System.out.println("in finally ");
				if (count == 2) {
					break;
				}
			}
		}
	}

}
