package cn.ssm.web;

import java.awt.print.Printable;
import java.util.concurrent.TimeUnit;
import static cn.ssm.web.Utils.*;

public class ADaemon implements Runnable {

	@Override
	public void run() {
		try {
			//print("daemon start");
			System.out.println("daemon start");
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			System.out.println("daemon interrupt ");
		} finally {
			System.out.println("this should always run?");
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(new ADaemon());
		t.setDaemon(true);
		t.start();
		
	}

}
