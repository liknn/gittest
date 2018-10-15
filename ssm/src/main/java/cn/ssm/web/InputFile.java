package cn.ssm.web;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
	private BufferedReader in;

	public InputFile(String fname) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fname));
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ���" + fname);
			throw e;
		} catch (Exception e) {
			try {
				in.close();
			} catch (IOException ioe) {
				System.out.println("�ر�ʧ��" + fname);
			}
			throw e;
		} finally {

		}

	}

	public String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch (IOException e) {
			throw new RuntimeException("readline ʧ��");
		}

		return s;
	}

	public void dispose() {
		try {
			in.close();
			System.out.println("dispose suc");
		} catch (IOException e) {
			throw new RuntimeException("�ر�ʧ��");
		}
	}

}
