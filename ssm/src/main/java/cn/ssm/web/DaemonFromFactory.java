package cn.ssm.web;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable {

	@Override
	public void run() {
		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread() + " nterrupted");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool(new DaemonThreadFactory());

		for (int i = 0; i < 10; i++) {
			es.execute(new DaemonFromFactory());
		}

		System.out.println("ALL DAEMON start");

		TimeUnit.MILLISECONDS.sleep(500);
	}

}
