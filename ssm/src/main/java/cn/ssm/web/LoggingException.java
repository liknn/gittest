package cn.ssm.web;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

@SuppressWarnings("serial")
public class LoggingException extends Exception {

	Logger logger = Logger.getLogger("LoggingException");

	public LoggingException() {
		StringWriter wr = new StringWriter();
		printStackTrace(new PrintWriter(wr));

		logger.severe(wr.toString());

	}

	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			//System.err.println(e);
		}
	}

}
