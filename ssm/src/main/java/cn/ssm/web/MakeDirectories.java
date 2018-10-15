package cn.ssm.web;

import java.io.File;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class MakeDirectories {
	private static void usage() {
		System.err.println("Usage:MakeDirectories path1 ...\n" + "Create each path\n" + "");

		System.exit(1);

	}

	public static void fileDate(File f) {
		System.out.println("Absolute£º" + f.getAbsolutePath() + "\n Can read£º" + f.canRead() + "\n getName£º"
				+ f.getName() + "\n getParent£º" + f.getParent() + "\n getPath£º" + f.getPath() + "\n length£º" + f.length()
				+ "\n lastModified£º" + f.lastModified());

		if (f.isFile())
			System.out.println("It's a file");
		else
			System.out.println("It's a directory");
		
		System.out.println();
	}

	public static void main(String[] args) {
		fileDate(new File("."));
		if (args.length < 1)
			usage();
		if (args[0].equals("-r")) {
			if (args.length != 3)
				usage();

			File old = new File(args[1]), rname = new File(args[2]);
			old.renameTo(rname);
			fileDate(old);
			fileDate(rname);
			return;
		}
		int count = 0;
		boolean del = false;
		if (args[0].equals("-d")) {
			count++;
			del = true;
		}
		count--;
		while (++count < args.length) {
			File f = new File(args[count]);
			if (f.exists()) {
				System.out.println(f + " exists");
				if (del) {
					System.out.println("deleting..." + f);
					f.delete();
				}
			} else {
				if (!del) {
					f.mkdirs();
					System.out.println("created " + f);
				}
			}
			fileDate(f);
		}
	}

}
