package cn.ssm.web;

public class EventChecker implements Runnable {
	private IntGenerator generator = null;

	private final int id;

	public EventChecker(IntGenerator g, int ident) {
		generator = g;
		id = ident;
	}

	@Override
	public void run() {
		while (!generator.isCanceled()) {
			int val = generator.next();
			if (val % 2 != 0) {
				System.out.println(val + " not enen");
				generator.cancel();
			}
		}
	}
	
}
