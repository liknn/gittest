package cn.ssm.web;

public class MutipleReturns {
	public static void main(String[] args) {
		int a = 9;
		try {
			if (a == 0)
				return;
			if (a == 1)
				return;
			if (a == 2)
				return;
			if (a == 3)
				return;
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}
