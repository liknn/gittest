package cn.ssm.web;

import java.awt.print.Printable;
import java.util.concurrent.TimeUnit;

import com.sun.tools.extcheck.Main;

public class SimpleDaemons implements Runnable {

	@Override
	public void run() {

		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(Thread.currentThread() + " Interrupt");
		}

	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new SimpleDaemons());
			thread.setDaemon(true);
			thread.start();
		}

		System.out.println("all daemons start");

		TimeUnit.MILLISECONDS.sleep(175);

	}

}
