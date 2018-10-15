package cn.ssm.web;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SimpleRunnable implements Runnable {
	private String run;

	public SimpleRunnable(String run) {
		this.run = run;
	}

	@Override
	public void run() {
		try {
			System.out.println("run1 starts");
			synchronized (run) {
				run.wait();
			}

			System.out.println("run1 awaik");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class SimpleRunnable2 implements Runnable {
	private String run;

	public SimpleRunnable2(String run) {
		this.run = run;
	}

	@Override
	public void run() {

		try {
			System.out.println("run2 start");
			TimeUnit.SECONDS.sleep(1);
			synchronized (run) {
				run.notifyAll();
			}
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
