package cn.ssm.web;

import java.util.concurrent.TimeUnit;

public class SimpleSyschro {

	public void a() {
		for (int i = 0; i < 10; i++) {
			System.out.println("a " + i);
		}

	}

	public void b() {
		for (int i = 0; i < 10; i++) {
			System.out.println("b " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		SimpleSyschro ss = new SimpleSyschro();

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized(ss) {
					ss.a();
				}
				
			}
		});
		t.start();

		// TimeUnit.MILLISECONDS.sleep(1);

		t = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized(ss) {
					ss.b();
				}
			}
		});
		t.start();

	}

}
