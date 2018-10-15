package cn.ssm.web;

import java.io.File;
import java.util.Formatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class A implements Runnable {
	private static String lock = "a";

	public static void main(String[] args) {
//		ExecutorService es = Executors.newCachedThreadPool();
//		es.execute(new SimpleRunnable(lock));
//		es.execute(new SimpleRunnable2(lock));
		
//		File old = new File("D:\\aa\\a.txt"), rname = new File("D:\\aa\\as.txt");
//		old.renameTo(rname);
//		MakeDirectories.fileDate(old);
//		MakeDirectories.fileDate(rname);
		
		   String name = "huhx";
	        int age = 22;
	        
	        Formatter formatter = new Formatter(System.out);
	        formatter.format("My name is %s, and my age is %d ", name, age);
	        formatter.close();

	}

	@Override
	public void run() {
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("a " + i);
		}
	}
}

class B implements Runnable {



	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("b " + i);
		}
	}
}
