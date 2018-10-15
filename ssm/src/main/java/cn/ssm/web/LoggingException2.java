package cn.ssm.web;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.sun.jdi.InvalidLineNumberException;

public class LoggingException2 {
	static Logger logger = Logger.getLogger("LoggingException2");

	public static void info(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		logger.severe(sw.toString());
	}

	static void testDo(String str) {
		throw new RuntimeException("123");
	}

	static void testDo() throws Exception {
		throw new Exception("asd");
	}

	public static void main(String[] args) throws ClassCastException, SQLException {

		try {
			testDo();
		} catch (NullPointerException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (Exception e) {
			StackTraceElement[] se = e.getStackTrace();

			for (StackTraceElement s : se) {
				System.out.println(
						s.getFileName() + " " + s.getClassName() + " " + s.getMethodName() + " " + s.getLineNumber());
			}

		}
	}
}
