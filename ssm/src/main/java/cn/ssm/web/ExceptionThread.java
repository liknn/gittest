package cn.ssm.web;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static cn.ssm.web.Utils.print;

public class ExceptionThread implements Runnable {

	@Override
	public void run() {

		throw new RuntimeException("123");

	}

	public static void main(String[] args) {
		try {
			ExecutorService es = Executors.newCachedThreadPool();
			es.execute(new ExceptionThread());

			//es.shutdown();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
